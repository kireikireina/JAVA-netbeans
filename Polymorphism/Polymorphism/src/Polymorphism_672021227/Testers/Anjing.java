package Testers;
import Abstract.Binatang;

public class Anjing extends Binatang {
    private String Ras;
    int Kecepatan;

    public String getRas() {
        return Ras;
    }

    public void setRas(String Ras) {
        this.Ras = Ras;
    }

    public int getKecepatan() {
        return Kecepatan;
    }

    public void setKecepatan(int Kecepatan) {
        this.Kecepatan = Kecepatan;
    }

    @Override
    public void Cetak() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    }
