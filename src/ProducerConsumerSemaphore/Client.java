package ProducerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Semaphore prodSema = new Semaphore(5);
        Semaphore consSema = new Semaphore(0);
        Store store = new Store(5);
        //8 threads constantly trying to produce item
        for(int i = 1; i<=8; ++i){
            ex.execute(new Producer(store, prodSema, consSema));
        }
        // 8 thread constantly trying to remove item
        for(int i = 1 ; i <= 8; ++i){
            ex.execute(new Consumer(store, prodSema, consSema));
        }
    }
}
