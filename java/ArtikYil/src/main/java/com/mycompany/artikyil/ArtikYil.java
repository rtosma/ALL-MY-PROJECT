/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.artikyil;

import java.util.Scanner;

/**
 *
 * @author RECEP OSMA
 */
public class ArtikYil {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir yil giriniz");
        
        int yil=input.nextInt();
        boolean yuzYil=yil%100!=0;
        boolean dortYil=yil%4==0;
        boolean dortYuz=yil%400==0;
        if(yuzYil==true&&dortYil==true||dortYuz==true)
        {
            System.out.println("Artik yildir");
        }
        else
        {
            System.out.println("Artik yil degil");
        }
        
    }
}
