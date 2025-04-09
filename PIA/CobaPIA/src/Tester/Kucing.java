package Tester;

import Abstracts.Binatang;
import Interfaces.MakhlukHidup;
import Interfaces.Sifat;

public class Kucing extends Binatang implements MakhlukHidup, Sifat{

    @Override
    public void berbicara() {
        System.out.println(super.getNama() + " meow");
    }

    @Override
    public void bernapas() {
        System.out.println(super.getNama() + " bernapas dengan paru-paru");
    }

    @Override
    public void cetakSifat() {
        System.out.println(super.getNama() + " suka mencakar");
    }
    
}
