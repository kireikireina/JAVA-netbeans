package Model;

public class Mahasiswa {
    private String NIM;
    private String Nama;
    private long Uang;
    
//class model biasanya diisi getter & setter + constructor (melambangkan tabel DB)
    
    public String getNIM() {
        return NIM;
    }

    public Mahasiswa(String NIM, String Nama, long Uang) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Uang = Uang;
    }

    public void setNIM(String NIM) {
        if (NIM.contains("67")){
            this.NIM = NIM;
        } else {
            System.out.println("Harus Mahasiswa TI!");
        }
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public long getUang() {
        return Uang;
    }

    public void setUang(long Uang) {
        //aturan khusus bisa dimasukkan dlm model
        if (this.Uang < 50000){
            System.out.println("saldo tidak cukup");
        } else {
        this.Uang = Uang;
        }
    }
    
    
}
