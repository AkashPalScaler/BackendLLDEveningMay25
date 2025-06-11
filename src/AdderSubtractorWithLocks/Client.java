package AdderSubtractorWithLocks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v = new Value(); //V has an intrinsic lock
        Lock lock = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println("Value of x before process : " + v.x);
        Future<Void> adderFuture =  es.submit(new Adder(v, lock)); // started
        Future<Void> subtFuture =  es.submit(new Subtractor(v, lock)); //started

        adderFuture.get(); // Future.get waits till task is over
        subtFuture.get();

        System.out.println("Value of x : " + v.x);
    }
}
