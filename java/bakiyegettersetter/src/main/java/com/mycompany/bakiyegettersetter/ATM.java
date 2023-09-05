/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bakiyegettersetter;

/**
 *
 * @author RECEP OSMA
 */
public class ATM {
    private String isim;
    private String soyisim;
    private int bakiye;  
    
    
    public void paraCek(int para)
    {
        bakiye-=para;
        System.out.println(para+"tl para cekildi kalan bakiye = "+bakiye);
    }
    public void paraYatir(int para)
    {
        bakiye+=para;
        System.out.println(para+"tl para yatirildi toplam bakiye = "+bakiye);
    }
    public void havaleEt(int para)
    {
        bakiye-=para;
        System.out.println(para+"tl  havale edildi kalan bakiye = "+bakiye);
    }
    public void havaleAl(int para)
    {
        bakiye+=para;
        System.out.println(para+"tl para alindi toplam bakiye = "+bakiye);
    }
    
    public void hesapGoster(){
        System.out.println("Toplam kalan bakiye : "+bakiye);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        if (isim.isEmpty()) {
        
            System.out.println("Lutfen isim alanini doldurun.. ");
            
        }
        else{
            this.isim=isim;
        }
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        
        if (soyisim.isEmpty()) {
            System.out.println("Lutfen soyisim alanini doldurunuz.. ");
            
        }
        
        else{
        this.soyisim = soyisim;
        }
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        if (bakiye<0) {
            
            System.out.println("Lutfen bakiyeyi 0'dan buyuk giriniz.");
        }
        else{
        this.bakiye = bakiye;
        }
    }
    
    
    
}
