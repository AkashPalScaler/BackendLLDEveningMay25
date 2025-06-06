package Multithreadprogram;

public class PrintAGivenNumber implements Runnable{
    int numberToPrint; //url of website to scrap
    public PrintAGivenNumber(int n){
        numberToPrint = n;
    }
    @Override
    public void run() {
        System.out.println("Number -> "+ numberToPrint + " by " + Thread.currentThread().getName());
        //SCRAPING the url given
    }
}
