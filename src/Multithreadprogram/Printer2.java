package Multithreadprogram;

//Not suggested - you are limited to extend only one class
public class Printer2 extends Thread{
    @Override
    public void run() {
        System.out.println("Printer 2 :" + Thread.currentThread().getName());
    }
}
