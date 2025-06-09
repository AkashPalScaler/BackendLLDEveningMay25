package ThreadPools;

import java.util.concurrent.Callable;

public class NumberMultiplier implements Callable<Integer> {

    int number;

    NumberMultiplier(int x){
        number = x;
    }


    @Override
    public Integer call() throws Exception {
        return number * 10; //Complicated operation taking 10s
    }
}
