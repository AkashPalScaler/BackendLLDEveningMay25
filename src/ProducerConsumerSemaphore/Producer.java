package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;

    Producer(Store st, Semaphore prodSema, Semaphore consSema){
        this.store = st;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    @Override
    public void run() {
        while(true){
            try {
                prodSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //more code - preprocessing of fuel order
            store.addItem(); // store.addItem(fuelOrderData)
            System.out.println("Producer added item : " + store.getItems().size());
            consSema.release();
        }
    }
}
