package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger h1=new Hamburger("sade","beyaz ekmek",
                "kırmızı",13.90);
        h1.ekleİlaveUrun1("patates kızartması",3.90);
        h1.ekleİlaveUrun2("kola",3.50);
        h1.ekleİlaveUrun3("sos",1.90);
        h1.ekleİlaveUrun4("soğan",2.60);
        System.out.println("toplam fiyat:"+h1.hamburgerBilgileri());

        SaglikliBurger s1=new SaglikliBurger("beyaz",10.50);
        s1.ekleİlaveUrun1("patates kızartması",3.90);
        s1.ekleİlaveUrun2("kola",3.50);
        s1.ekleİlaveUrun3("sos",1.90);
        s1.ekleİlaveUrun4("soğan",2.60);
        s1.ekleSaglikliUrun1("ton balığı",3.5);
        s1.ekleSaglikliUrun2("domates",2.20);
        System.out.println("toplam fiyat:"+s1.hamburgerBilgileri());

        BabaBurger bg=new BabaBurger();
        bg.ekleİlaveUrun1("patates kızartaması",1.5);
        System.out.println("toplam tutar:"+bg.hamburgerBilgileri());

    }
}
