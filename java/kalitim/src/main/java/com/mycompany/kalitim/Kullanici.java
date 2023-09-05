/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalitim;

/**
 *
 * @author RECEP OSMA
 */
public class Kullanici {
      private String kullaniciAdi;
      private String sifre;

    public Kullanici(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        
        
        if (kullaniciAdi.equals("admin")&&sifre.equals("123456")) {
            System.out.println("Giris Basarili");
   
}
    else
    {
        System.out.println("Tekrar Dene");
    }
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
      
      
      
}
