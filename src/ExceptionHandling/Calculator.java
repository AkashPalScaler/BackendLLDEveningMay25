package ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class Calculator {
    public static float divide(int a, int b) throws IOException, SQLException{
       try{

        if(b == 0){
            //unChecked Exception
            throw new ArithmeticException();
        }else if (b < 0){
            //UnChecked Exception
            throw new NullPointerException();
        }else if(b == 100){
            // Trying to read a file
            // Some lib func to read a file : filereader(filepath)
            //Checked Exception
            throw new IOException();
        }else if(b == 200){
            //Trying to connect to DB
            //Checked Exception
            throw new SQLException();
        }
        return a/b;

       }catch(SQLException e){
            System.out.println("DB error, try again!" + e.getMessage() + e.getStackTrace());
            throw e;
       }catch(ArithmeticException e){
            System.out.println("Divide by zero not allowed" + e.getMessage());
            throw e;
       }finally{
            return 0f;
       }
       
    }

    public static float divideAgain(int a, int b) {
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("Divide by zero not allowed!");
        }
        return 0f;
    }

    public void test() throws SQLException, IOException{
        throw new SQLException();
    }
}

