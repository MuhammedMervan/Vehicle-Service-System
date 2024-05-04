package com.Packagee;

public class tekniker extends kullanici{


  private ariza[] arizaGecmisi = new ariza[20];
  private ariza[] ilgilendigiAktifAriza = new ariza[3]; //Every technision can deal with 4 problems
  private static int arizaAktifIndexi = 0;
  private static int arizaGecmisIndexi = 0;
  private double ucreti;


  public tekniker(String adi) {
    super(adi);
  }

  //Adding new porblem with the specified index
  public void addAktifAriza(ariza yeni_ariza){
    ilgilendigiAktifAriza[arizaAktifIndexi] = yeni_ariza;
    arizaAktifIndexi++;
  }

  public void ilgilendigiAktifArizalistele(){
    for(int i = 0; i < ilgilendigiAktifAriza.length; i++){
      System.out.println(i + 1 + " : " + ilgilendigiAktifAriza[i]);
    }
  }

  public void gecmiseEkle(ariza yeni_ariza){
    arizaGecmisi[arizaAktifIndexi] = yeni_ariza;
    arizaGecmisIndexi++;
  }
  public void gecmisArizaListele(){
    for(int i = 0; i < arizaGecmisi.length; i++){
      System.out.println(i + 1 + " : " + arizaGecmisi[i]);
    }
  }

}
