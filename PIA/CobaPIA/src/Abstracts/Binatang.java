package Abstracts;

public abstract class Binatang {
    private String jenis;
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetakData(){
        System.out.println("Nama: " +nama);
        System.out.println("Jenis: " +jenis);
    }
    
    public abstract void berbicara();
}
