package Multithreadprogram;

public class Client {
    public static void main(String[] args) {
        Runnable printer = new Printer();
        System.out.println("Inside main function : " + Thread.currentThread().getName());
        printer.run();
        Thread t = new Thread(printer);
        t.start(); // It creates a new thread and then assign run function to the new thread

        //Not suggested
        Printer2 pthread = new Printer2();
        pthread.start();

        for(int i=0;i<1000000;i++){
            Runnable task = new PrintAGivenNumber(i);

            Thread t1 = new Thread(task);
            t1.start();
        }
    }
}
//Printer printer =

// constructor : public Thread(?)

//Task : Print 100 numbers each in a different thread

//Define the task for a thread - Print a given number