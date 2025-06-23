package ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class Client {
public static void main(String[] args) throws CriticalSQLException{
        try{
            Calculator.divide(10, 200);
            //close the db connection
        }catch(SQLException akkash){
            //close the db connection
            System.out.println("DB Error, retrying 3 times ");
            // 3 times retry the query or recall function after waiting
            throw new CriticalSQLException();
        }catch(IOException e){
            //close the db connection
            //raise an alarm saying - file corruption
        }catch(Exception elon){
            //close the db connection
            System.out.println("UNHANDLED ERROR" + elon.getMessage());
        }finally{
            //close the db connection
        }
        Calculator.divideAgain(10, 0);
    }
}

// A -> B -> C -> D

// catchA 
// catchB
// catchC
// catchD
//the opposite of above should be the order