package Lambdas;

public class Client {
    public static void main(String[] args) {
        // Create a task class and implement runnable
        Runnable task0 = new Printer();
        //Anonymous class 
        Runnable task1 = new Runnable(){
            @Override
            public void run(){
                //Any logic that needs to be run on a diff thread
                System.out.println("Running in a different thread");
            }
        };
        
        Integer y = 10;
        
        // // We are creating a object
        // // Lambda functions will have the parent scope
        // TestInterface test = (Integer a) ->{
        //     System.out.println("Something" + y);
        //     return a;
        // };

        // TestInterface test1 = new TestClass();

        // test.run(10);
        //Lambda
        Runnable task2 = () ->{
            System.out.println("Printing in lambda");
        };
        // Only for one line
        Runnable task3 = () -> System.out.println("something");

        Thread t= new Thread(task2);

        t.start();
    }
    
}
