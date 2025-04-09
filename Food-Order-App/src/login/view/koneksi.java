package login.view;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getkoneksi(){
        if(koneksi==null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost/login";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return koneksi;
    }
    
    public static void main(String args[]){
        getkoneksi();
    }
}
