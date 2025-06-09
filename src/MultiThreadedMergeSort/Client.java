package MultiThreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = List.of(9,5,3,4,1,2,6,8,0);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> resultFuture = es.submit(new Sorter(arr, es));
        List<Integer> resultArr = resultFuture.get();

        System.out.println(resultArr.toString());
    }
}
