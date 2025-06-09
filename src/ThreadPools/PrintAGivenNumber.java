package ThreadPools;

public class PrintAGivenNumber implements Runnable{
    int numberToPrint; //url of website to scrap
    public PrintAGivenNumber(int n){
        numberToPrint = n;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Number -> "+ numberToPrint + " by " + Thread.currentThread().getName());
        //SCRAPING the url given
    }
}
