/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.faktoriyel;

import java.util.Scanner;

/**
 *
 * @author RECEP OSMA
 */
public class Faktoriyel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int faktoriyel = 1;
        int sayi;
        System.out.println("Faktoriyelini bulmak istediginiz sayiyi giriniz:");
        sayi = input.nextInt();
        
        
        for (int i = 1; i <= sayi; i++) 
        {
            faktoriyel=faktoriyel*i;   
        }
        System.out.println("Girilen sayinin faktoriyeli: "+faktoriyel);
    }
}
