package com.company;

public class SaglikliBurger extends Hamburger {

    private String ilaveSaglikliUrunAdi1;
    private double ilaveSaglikliUrunUcreti1;
    private String ilaveSaglikliUrunAdi2;
    private double ilaveSaglikliUrunUcreti2;

    public SaglikliBurger( String etCesiti, double ucreti) {
        super("sağlikli burger", "kepekli", etCesiti, ucreti);
    }
    public void ekleSaglikliUrun1(String ad,double fiyat){
        this.ilaveSaglikliUrunAdi1=ad;
        this.ilaveSaglikliUrunUcreti1=fiyat;
    }
    public void ekleSaglikliUrun2(String ad,double fiyat){
        this.ilaveSaglikliUrunAdi2=ad;
        this.ilaveSaglikliUrunUcreti2=fiyat;
    }

    @Override
    public double hamburgerBilgileri() {
       double toplamucret=super.hamburgerBilgileri();
       if (ilaveSaglikliUrunAdi1 !=null){
           toplamucret +=ilaveSaglikliUrunUcreti1;
           System.out.println("ilave sağlık burger ürünü:"+this.ilaveSaglikliUrunAdi1
                                            +"fiyatı:"+this.ilaveSaglikliUrunUcreti1);
       }
        if (ilaveSaglikliUrunAdi2 !=null){
            toplamucret +=ilaveSaglikliUrunUcreti2;
            System.out.println("ilave sağlık burger ürünü:"+this.ilaveSaglikliUrunAdi2
                    +"fiyatı:"+this.ilaveSaglikliUrunUcreti2);
        }
        return toplamucret;

    }
}
