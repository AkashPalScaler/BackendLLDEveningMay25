package MultiThreadedSumCalculator;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.IntUnaryOperator;

public class ArraySummation implements Callable<Long> {
    List<Integer> arr;
    Integer start;
    Integer end;

    public ArraySummation(List<Integer> arr, Integer start, Integer end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        Long sum = 0l;
        for(int i=start;i<end;i++){
            sum+= arr.get(i);
        }
        return sum;
    }
}
