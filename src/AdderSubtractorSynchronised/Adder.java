package AdderSubtractorSynchronised;

import staticExample.Student;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Value v;
    Student s;
    public Adder(Value v, Student s){
        this.v = v; this.s = s;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100;i++){
            synchronized (v){ //v.lock.lock()
                v.x += i;
            } //v.lock.unlock()
        }
        return null;
    }
}
