package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        DbConnection db1 = DbConnection.getInstance("Akash", "pass");
        DbConnection db2 = DbConnection.getInstance("SAm", "pass");
        // db1.execute("select * from table_name");
        System.out.println("DEBUG");
    }
}
