package com.Packagee;

public class kullanici {
  private String ad;
  private String ID = "2022";
  private static int basic_ID = 0;
  private int ucret;

  kullanici(String ad){
    this.ad = ad;
  }

  public void ucret ( int ucret ) {
    this.ucret = ucret;
  }


  public void IDOlusturma(){
    this.ID = this.ID + basic_ID;
    basic_ID++;
  }

}