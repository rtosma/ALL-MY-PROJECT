/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.competition;

/**
 *
 * @author RECEP OSMA
 */
public class Competition {

    public static void main(String[] args) {
        ogrenc ahmet = new ogrenc("Osman","Er","1589","1983");
        ogrenciisleri ogr = new ogrenciisleri(ahmet);
        
        ogr.ekle();
        ogr.sil();
    }
}
