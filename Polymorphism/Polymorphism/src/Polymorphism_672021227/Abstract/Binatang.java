package Abstract;
import java.util.Scanner;

public abstract class Binatang {
    private String Nama;
    private String Jenis;
    
    public abstract void Cetak();
    
    public void CetakNama(){
        System.out.println("Nama: " +Nama);
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
}
