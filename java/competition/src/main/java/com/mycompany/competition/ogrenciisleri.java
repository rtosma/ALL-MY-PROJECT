/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.competition;

/**
 *
 * @author RECEP OSMA
 */
public class ogrenciisleri {
    
    public ogrenc ahmet;

    public ogrenciisleri(ogrenc ahmet) {
        this.ahmet = ahmet;
    }
    
    public void ekle()
    {
        System.out.println("Ogrenci isiteme eklendi "+ahmet.isim);
    }
    
    public void sil()
    {
        System.out.println("Ogrenci cikarildi"+ahmet.numara);
    }
            
            
    
}
