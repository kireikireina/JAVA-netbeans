package Tester;

public class Main {
    public static void main(String[] args){
        Kucing k = new Kucing();
        k.setNama("neko");
        k.setJenis("domestic");
        
        //cetak data
        k.cetakData();
        
        //bernapas
        k.cetakData();
        k.bernapas();
        
        //berbicara
        k.cetakData();
        k.berbicara();
        
        //sifat
        k.cetakSifat();
    }
    
}
