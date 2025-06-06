package Multithreadprogram;

public class Printer implements Runnable {
    @Override
    public void run() {
        System.out.println("Printer task -> " +Thread.currentThread().getName());
    }
}
