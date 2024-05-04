package com.Packagee;



public class arac {
  //  int plaka numarası, Musteri tipinde sahip, kayit tarihi, ariza turu, model, marka, renk
  private String tur;
  private String model;
  private String marka;
  private String renk;
  private int plakaNumarası;
  private String sahibi;


  tur(String tur){
    this.tur = tur;
  }

  arac(String marka){
    this.marka = marka;
  }

  arac(String renk){
    this.renk = renk;
  }

  arac(int plakaNumarası){
    this.plakaNumarası = plakaNumarası;
  }

  void musteri(String sahibi){
    this.sahibi = sahibi;
  }

}