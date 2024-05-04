package com.Packagee;


import java.util.ArrayList;

public class musteri extends kullanici {
  // rendevu tarihleri, ad, arabasi, rendevu sayisi,

    private String  ad;
    private String  tarih;
    private String  musteri;
    private int randevuSayisi = 0;



  musteri(String ad) {
    super(ad);
  }


  public void musteriBilgisiGoster(String ad){
    this.ad = ad;
  }

  public void rendevuTarihi ( String tarih ) {
      this.tarih = tarih;
    }

     public String getTarih() {
      return tarih;
       randevuSayisi++ ;
    }

    public void setTarih ( String tarih ) {
      this.tarih = tarih;
    }

  public void setAd ( String ad ) {
    this.ad = ad;
  }

  public void getAd ( String ad ) {
    this.ad = ad;
  }

    @Override
    public String toString ( ) {
      return "Randevu Tarihi { " + "tarih=" + tarih + " }";
    }
        //



  }






}

