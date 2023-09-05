/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javanewtekrar;

/**
 *
 * @author RECEP OSMA
 */
public class kullanici {
    private String isim = "caglar";
    private String soyisim = "akar";
    private int yas = 43;
    
    public void bilgiGoster(){
        System.out.println(isim);
        System.out.println(soyisim);
        System.out.println(yas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    
    
    
    
    
    
    
}
