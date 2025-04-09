package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    private static Koneksi instance = new Koneksi();
    public static Connection conn;
    
    public static Koneksi getInstance(){
        return instance;
    }
    
    public static Connection getConnection(){
        return conn;
    }
    
    private Koneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:localhost:3306/");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
