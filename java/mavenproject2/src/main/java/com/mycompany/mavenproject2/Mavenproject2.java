/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author RECEP OSMA
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        int [][] dizi = new int [5][6];
        
        int sayi = 0;
        
        for (int i = 0; i <dizi.length; i++) {
            
            for (int j = 0; j <dizi[i].length; j++) {
                dizi[i][j]=sayi;
                System.out.print(dizi[i][j]+"  ");
                sayi+=2;
                
            }
            sayi+=8;
            System.out.println("");
            
        }
    }
}
