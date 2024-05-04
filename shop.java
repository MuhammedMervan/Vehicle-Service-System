package com.Packagee;


public class shop {
  private String ad;
  musteri[] musteriler = new musteri[1000];
  tekniker[] tekniker = new tekniker[20];
  static int musteriler_indexi = 0;

  public shop(String m1) {
  }

  public shop() {

  }


  public void musteri_ekle(musteri yeni_musteri){
    musteriler[musteriler_indexi] = yeni_musteri;
    musteriler_indexi++;
  }

  public void musteriSilme(String ad){
    for(int i = 0; i < musteriler.length; i++) {
      if (ad = musteriler[i])
      {musteriler[i] = null;}
    }}

   public toplamUcret(double ucret){

   }
   public ortalamaKazanc(double ucret){
   double ortalamaKazanc = (ucret * musteriler_indexi) / musteriler_indexi;
    }

    public void Karmasik_String_Arama(char harf){

    for(int i = 0; i < musteriler.length; i++){
      if(musteriler[i].getAd().charAt(0) = harf){
        System.out.println("Musteri Bilgileri : " + musteriler[i].musteriBilgisiGoster()); // make new method showing the user info
      }
    }
  }
}