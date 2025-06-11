package AdderSubtractorSynchronised;

import staticExample.Student;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    Value v;
    Student s;
    public Subtractor(Value v, Student s){
        this.v = v; this.s = s;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100;i++){
            synchronized (v) {
                v.x -= i;
            }
        }
        return null;
    }
}

// every object has an intrinsic lock
