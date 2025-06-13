package MultiThreadedSumCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors(); //2x
        System.out.println("Available cores : " + cores);

        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<100000;i++){
            arr.add(i);
        }


        Integer chunkSize = arr.size()/cores;


        ExecutorService es = Executors.newCachedThreadPool();

        List<Future<Long>> sumArrFutures = new ArrayList<>();

        for(Integer i=0;i<cores;i++){
            Callable<Long> task = new ArraySummation(arr, i * chunkSize , (i+1)* chunkSize);
            sumArrFutures.add(es.submit(task));
        }
        Long sum = 0l;

        for(Future<Long> future : sumArrFutures){
            sum += future.get();
        }
        System.out.println("Sum : " + sum);

    }
}
// starttime -> store current time
//task
//endtiume -> current time
//endtime-starttime