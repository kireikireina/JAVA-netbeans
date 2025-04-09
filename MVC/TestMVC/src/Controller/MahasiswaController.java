package Controller;

import Koneksi.Koneksi;
import Model.Mahasiswa;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class MahasiswaController {
    //di sini diisi hal2 yg berhubungan dgn model mahasiswa
    public int simpanMahasiswa (Mahasiswa mhs){
        //melakukan simpan ke dlm database
        //query, proteksi
        try {
            //persiapan koneksi
            Connection con = Koneksi.getConnection();
            //persiapan statement
            Statement st = con.createStatement();
            //persiapan query
            String sql = "INSERT INTO mahasiswa (nim, nama, saldo) VALUES('"+mhs.getNIM()+"','"+mhs.getNama()+"', "+mhs.getUang()+")";
            return st.executeUpdate (sql);
        } catch (SQLException ex) {
            System.out.println("insert error: " +ex.getMessage());
        }
        //kl menyimpan ke dlm database berhasil:
        return 0;
    }
    
    public List<Mahasiswa> readAll(){
        List<Mahasiswa> ls = new ArrayList<Mahasiswa>();
        try {
            Connection con = Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT *FROM mahasiswa");
            while(rs.next()){
                Mahasiswa m = new Mahasiswa(
                        rs.getString("nim"), 
                        rs.getString("nama"), 
                        Long.parseLong("uang")
                );
                ls.add(m);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }return ls;
    } 
}
