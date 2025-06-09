package ThreadPools;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        //Fixed Thread pool
//        ExecutorService es = Executors.newFixedThreadPool(10);
//        for(int i=0;i<1000000;i++){
//            Runnable task = new PrintAGivenNumber(i);
//            es.execute(task);
//
//            if(i == 10000){
//                System.out.println("DEBUG");
//            }
//        }

        //Cached thread pool - Never makes a task wait in queue - priority to task
//        ExecutorService es1 = Executors.newCachedThreadPool();
//        for(int i=0;i<1000000;i++){
//            Runnable task = new PrintAGivenNumber(i);
//            es1.execute(task);
//
//            if(i == 10000){
//                System.out.println("DEBUG");
//            }
//        }

         ExecutorService es2 = Executors.newCachedThreadPool();

         NumberMultiplier task = new NumberMultiplier(10);

         Future<Integer> futureResult = es2.submit(task);
        Future<Integer> futureResult2 = es2.submit(task);
        Future<Integer> futureResult3 = es2.submit(task);
         System.out.println("Already started printing this");

         Integer result1 = futureResult.get(); // waiting here 8s
        Integer result2 = futureResult2.get(); // 2s
        Integer result3 = futureResult3.get(); // 5s

        System.out.println("Result :"  + result2);

    }
}
//Printer printer =

// constructor : public Thread(?)

//Task : Print 100 numbers each in a different thread

//Define the task for a thread - Print a given number


// CPU heavy task : threads = numOfCores * 1x/2x
// I/O (Lot of idle time in between) = numOfCores * 4x/8x