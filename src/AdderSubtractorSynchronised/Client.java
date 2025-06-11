package AdderSubtractorSynchronised;

import staticExample.Student;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v = new Value();

        Student s = new Student();

        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println("Value of x before process : " + v.x);
        Future<Void> adderFuture =  es.submit(new Adder(v, s)); // started
        Future<Void> subtFuture =  es.submit(new Subtractor(v, s)); //started

        adderFuture.get(); // Future.get waits till task is over
        subtFuture.get();

        System.out.println("Value of x : " + v.x);
    }
}
