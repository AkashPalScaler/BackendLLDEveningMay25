package ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class ScientificCalc extends Calculator {
    public void test() throws IOException{
        System.out.println("Akasdh");
        throw new IOException();
    }
}
// Calculator c = new ScientCal();
// c.test()
