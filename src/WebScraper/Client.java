package WebScraper;

public class Client {
    public static void main(String[] args) {

    }
}
//
//Problem Statement
//Given a list of 100 URLs (e.g., "http://example.com/pageX"), simulate fetching the page content using Thread.sleep(200ms).
//Implement two versions:
//Use a FixedThreadPool(10) to process 10 URLs at a time.
//Use a CachedThreadPool to process them dynamically.
//Compare the execution time for both approaches.


//Bank Account Synchronization (synchronized block and method)
//Objective
//Learn how to avoid race conditions using synchronized.
//
//Problem Statement
//Implement a BankAccount class with a balance.
//Create multiple threads representing depositors and withdrawers.
//Simulate a race condition where multiple users deposit and withdraw simultaneously.
//Fix the issue using:
//synchronized methods
//synchronized blocks
//Measure execution time with and without synchronization.