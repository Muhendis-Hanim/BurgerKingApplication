package com.company;

public class BabaBurger extends Hamburger {
    public BabaBurger() {
        super("baba burger", "beyaz ekmek", "kırmızı", 16.90);
        super.ekleİlaveUrun1("patates kızartması",2.30);
        super.ekleİlaveUrun2("kola",1.5);

    }

    @Override
    public void ekleİlaveUrun1(String ad, double ucret) {
        System.out.println("ilave urun ekleyemezsınız");
    }

    @Override
    public void ekleİlaveUrun2(String ad, double ucret) {
        System.out.println("ilave urun ekleyemezsınız");
    }

    @Override
    public void ekleİlaveUrun3(String ad, double ucret) {
        System.out.println("ilave urun ekleyemezsınız");
    }

    @Override
    public void ekleİlaveUrun4(String ad, double ucret) {
        System.out.println("ilave urun ekleyemezsınız");
    }
}
