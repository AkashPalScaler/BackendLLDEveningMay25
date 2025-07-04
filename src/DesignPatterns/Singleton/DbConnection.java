package DesignPatterns.Singleton;

public class DbConnection {
    String username;
    String password;

    private static DbConnection dbInstance;

    private DbConnection(String username, String password ){
        this.username = username;
        this.password = password;
    }

    public static DbConnection getInstance(String username, String password){
        if(dbInstance == null){
            dbInstance = new DbConnection(username, password);
        }
        return dbInstance;
    }
}
