package com.company;

public class Hamburger {
    private String ismi;
    private String  ekmekCesiti;
    private String etCesiti;
    private double ucreti;

    private String ilaveUrunAdi1;
    private double ilaveUrunUcreti1;
    private String ilaveUrunAdi2;
    private double ilaveUrunUcreti2;
    private String ilaveUrunAdi3;
    private double ilaveUrunUcreti3;
    private String ilaveUrunAdi4;
    private double ilaveUrunUcreti4;

    public void ekleİlaveUrun1(String ad,double ucret){
        this.ilaveUrunAdi1=ad;
        this.ilaveUrunUcreti1=ucret;
    }
    public void ekleİlaveUrun2(String ad,double ucret){
        this.ilaveUrunAdi2=ad;
        this.ilaveUrunUcreti2=ucret;
    }
    public void ekleİlaveUrun3(String ad,double ucret){
        this.ilaveUrunAdi3=ad;
        this.ilaveUrunUcreti3=ucret;
    }
    public void ekleİlaveUrun4(String ad,double ucret){
        this.ilaveUrunAdi4=ad;
        this.ilaveUrunUcreti4=ucret;
    }
    public Hamburger(String ismi, String ekmekCesiti, String etCesiti, double ucreti) {
        this.ismi = ismi;
        this.ekmekCesiti = ekmekCesiti;
        this.etCesiti = etCesiti;
        this.ucreti = ucreti;
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public String getEkmekCesiti() {
        return ekmekCesiti;
    }

    public void setEkmekCesiti(String ekmekCesiti) {
        this.ekmekCesiti = ekmekCesiti;
    }

    public String getEtCesiti() {
        return etCesiti;
    }

    public void setEtCesiti(String etCesiti) {
        this.etCesiti = etCesiti;
    }

    public double getUcreti() {
        return ucreti;
    }

    public void setUcreti(double ucreti) {
        this.ucreti = ucreti;
    }
    public double hamburgerBilgileri(){
        double toplamucret=ucreti;
        System.out.println(" hamburger adı:"+this.ismi
                            +"\n ekmek çeşiti:"+this.ekmekCesiti
                            +"\n et çeşiti:"+this.etCesiti
                            +"\n fiyat:"+this.ucreti);
        if (ilaveUrunAdi1 != null){
            toplamucret +=ilaveUrunUcreti1;
            System.out.println("ilave ürün:"+this.ilaveUrunAdi1
                    +" ilave ürün ücreti:"+this.ilaveUrunUcreti1);
        }
        if (ilaveUrunAdi2 != null){
            toplamucret +=ilaveUrunUcreti2;
            System.out.println("ilave ürün:"+this.ilaveUrunAdi2
                    +" ilave ürün ücreti:"+this.ilaveUrunUcreti2);
        }
        if (ilaveUrunAdi3 != null){
            toplamucret +=ilaveUrunUcreti3;
            System.out.println("ilave ürün:"+this.ilaveUrunAdi3
                    +" ilave ürün ücreti:"+this.ilaveUrunUcreti3);
        }
        if (ilaveUrunAdi4 != null){
            toplamucret +=ilaveUrunUcreti4;
            System.out.println("ilave ürün:"+this.ilaveUrunAdi4
                    +" ilave ürün ücreti:"+this.ilaveUrunUcreti4);
        }
        return toplamucret;
    }
}
