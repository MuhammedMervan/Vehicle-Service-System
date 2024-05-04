package com.Packagee;

import java.util.Scanner;

public class Main {

  static shop shop = new shop();
  static musteri musteri = new musteri();
  static kullanici kullanici = new kullanici();
  static ariza ariza = new ariza();
  static tekniker tekniker = new tekniker();
  static arac arac = new arac();


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("adinizi giriniz :");
    String ad = sc.nextLine();
    musteri.getAd(ad);
    System.out.println("aracin turu modeli markasi ve plaka numarasini giriniz:");
    String bilgi = sc.nextLine();
    musteri.musteriBilgisiGoster(bilgi);
    System.out.println(" ariza turunu giriniz : ");
      String ariza = sc.nextLine();
      ariza.arizaTuru(ariza);
      System.out.println("arizanin aciklamasini giriniz :");
      String aciklama = sc.nextLine();
      ariza.aciklama(aciklama);
      System.out.println("arizalarini gormek istediginiz teknikerin adini giriniz :");
      String teknikerinAdi = sc.nextLine();
      tekniker.ilgilendigiAktifArizalistele();
    String ad;
    public static void musteriSilme (String ad){
      System.out.println("Silmek istediginiz Müşterinin adını giriniz :");
      ad = sc.nextLine();
      String aktifAriza;
      if (aktifAriza == null) {
        shop.musteriSilme(ad);
      } else {
        (musteri.musteriBilgisiGoster(ad));
      }


    }
  }
}
