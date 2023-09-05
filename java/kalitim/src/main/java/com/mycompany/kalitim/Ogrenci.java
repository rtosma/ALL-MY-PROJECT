/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalitim;

/**
 *
 * @author RECEP OSMA
 */
public class Ogrenci extends Kullanici {
    
    private int okulNo;

    public Ogrenci(int okulNo, String kullaniciAdi, String sifre) {
        super(kullaniciAdi, sifre);
        this.okulNo = okulNo;
        System.out.println("Ogrenci Okul NO:"+okulNo);
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }
    
    
    
}
