package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService es;

    public Sorter(List<Integer> arr, ExecutorService es){
        arrayToSort = arr;
        this.es = es;
    }

    public List<Integer> merge(List<Integer> sortedLeftArray, List<Integer> sortedRightArray){
        // Merging the two sorted arrays
        int i= 0; // start of left
        int j = 0; //start of right

        ArrayList<Integer> sortedArray = new ArrayList();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }


    @Override
    public List<Integer> call() throws InterruptedException, ExecutionException {
        //base case
        if(arrayToSort.size() == 1){
            System.out.println("DEBUG");
            return arrayToSort;
        }

        int size = arrayToSort.size();
        int mid = size/2;

        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArr.add(arrayToSort.get(i));
        }

        for(int i=mid;i<size;i++){
            rightArr.add(arrayToSort.get(i));
        }

        // LeftRes = call/sorter(left) // 30s
        // RightRes = call/sorter(right) //30s

        Sorter leftSorter = new Sorter(leftArr, es); //New sorter task for left arr
        Sorter rightSorter = new Sorter(rightArr, es);

        Future<List<Integer>> sortedLeftArrFuture = es.submit(leftSorter); // internally calls call()
        Future<List<Integer>> sortedRightArrFuture = es.submit(rightSorter); // internally calls call()

        List<Integer> sortedLeftArray = sortedLeftArrFuture.get();
        List<Integer> sortedRightArray = sortedRightArrFuture.get();

        return merge(sortedLeftArray, sortedRightArray);
    }
}
