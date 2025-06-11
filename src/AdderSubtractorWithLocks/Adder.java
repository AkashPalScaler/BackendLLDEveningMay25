package AdderSubtractorWithLocks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value v;
    Lock lock;
    public Adder(Value v, Lock lock){
        this.v = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++){
            lock.lock();
            v.x += i;
            lock.unlock();
        }
        return null;
    }
}
