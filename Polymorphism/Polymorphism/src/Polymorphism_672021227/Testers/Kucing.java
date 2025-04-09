package Testers;
import Abstract.Binatang;
import Interface.Perilaku;

public class Kucing extends Binatang implements Perilaku {
    public String Ras;
    int Berat;

    public String getRas() {
        return Ras;
    }

    public void setRas(String Ras) {
        this.Ras = Ras;
    }

    public int getBerat() {
        return Berat;
    }

    public void setBerat(int Berat) {
        this.Berat = Berat;
    }

    @Override
    public void Cetak() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void CetakNama() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void setBerat(String o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
