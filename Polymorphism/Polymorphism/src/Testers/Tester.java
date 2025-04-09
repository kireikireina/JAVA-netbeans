package Testers;
import Abstract.Binatang;
import java.util.Scanner;
import Testers.Anjing;
import Testers.Kucing;

public class Tester {
    public static void main(String[] args, String Anjing, String Kucing){
        int k = 0;
        int y = 0;
        int s = 0;
        System.out.println("Masukkan Jumlah Binatang: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        Binatang[] binatang = new Binatang[n];
        Anjing[] a = new Anjing[n];
        Kucing[] b = new Kucing[n];
        for (int i = 0; i < n; i++) {
            System.out.println("");
            System.out.println("Binatang #" + (i+1));
            System.out.println("1. Anjing");
            System.out.println("2. Kucing");
            System.out.println("Jenis Binatang");
            int c = scan.nextInt();
            if (c==1){
                a[k] = new Anjing();
                a[k].setJenis(Anjing);
                System.out.println("Masukkan Nama: ");
                String h = scan.next();
                a[k].setNama(h);
                System.out.println("Masukkan Ras: ");
                String q = scan.next();
                a[k].setRas(q);
                System.out.println("Masukkan Kecepatan: ");
                String l = scan.next();
                a[k].setKecepatan(l);
                k++;
            } else if (c==2){
                b[k] = new Kucing();
                b[k].setJenis(Kucing);
                System.out.println("Masukkan Nama: ");
                String h = scan.next();
                b[k].setNama(h);
                System.out.println("Masukkan Ras: ");
                String q = scan.next();
                b[k].setRas(q);
                System.out.println("Masukkan Berat: ");
                String o = scan.next();
                b[k].setBerat(o);
                k++;
            }
            
        }
        
        System.out.println("===== TUGAS PEMROGRAMAN =====");
        System.out.println("===== POLIMORFISME JAVA =====");
        System.out.println("1. Tampilkan semua nama Binatang");
        System.out.println("2. Tampilkan semua Data Binatang");
        System.out.println("3. Tampilkan binatang terberat");
        System.out.println("4. Tampikan binatang tercepat");
        System.out.println("5. Exit");
        Scanner pilih = new Scanner(System.in);
        System.out.println("Pilihan = ");
        int menu = pilih.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("===== Menu 1: Semua Nama Binatang =====");
                for (int i = 0; i < n; i++) {
                    if(a[i]!= null){
                        System.out.println((i+1) + ". ");
                        a[i].CetakNama();
                    }else if(b[i]!=null){
                        System.out.println((i+1) + ". ");
                        a[i].CetakNama();
                    }
                } break;
            case 2: 
                System.out.println("===== Menu 2: Semua Data Binatang =====");
                for (int i = 0; i < n; i++) {
                    System.out.println("");
                    System.out.println("Data Binatang ke-"+ (i+1));
                    if(a[i]!= null){
                        a[i].Cetak();
                    }else if(b[i]!=null){
                        a[i].Cetak();
                    }
                } break;
            case 3: 
                System.out.println("===== Menu 3: Data Binatang Terberat =====");
                if (y==0){
                    System.out.println("Belum ada Data");
                } else {
                    int max = 0;
                    int index = 0;
                    for (int i = 0; i < n; i++) {
                        if(b[i]==null){
                            max=max;
                        }else if(b[i].getBerat()>max){
                            max = b[i].getBerat();
                            index = i;
                        } System.out.println("Kucing "+b[index].getNama() + "adalah yang terberat " + b[index].getBerat()+ " kg");
                    } 
                }break;
            case 4: 
                System.out.println("===== Menu 4: Data Binatang Tercepat");
                if(s==0){
                    System.out.println("Belum ada data");
                }else {
                    int cp = 0;
                    int haya = 0;
                    for (int i = 0; i < n; i++) {
                        if(a[i]==null){
                            cp=cp;
                        }else if(a[i].getKecepatan()>cp){
                            cp = a[i].getKecepatan();
                            haya = i;
                        } System.out.println("Anjing " + a[haya].getNama()+ " adalah yang tercepat " + a[haya].getKecepatan()+ " mph");
                    }
                }break;
            case 5: 
                System.exit(0);
                break;
            default : 
                System.out.println("Input Salah");
                    
                }
        }
        
    }
