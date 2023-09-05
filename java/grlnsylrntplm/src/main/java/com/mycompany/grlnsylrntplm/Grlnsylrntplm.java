/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.grlnsylrntplm;

import java.util.Scanner;

/**
 *
 * @author RECEP OSMA
 */
public class Grlnsylrntplm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int toplam = 0;
        int sayi;
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+".sayiyi giriniz:");
            sayi=input.nextInt();
            toplam+=sayi;
            
        }
        System.out.println("girilen sayilarin toplami: "+toplam);
    }
}
