/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bakiyegettersetter;

import java.util.Scanner;

/**
 *
 * @author RECEP OSMA
 */
public class Bakiyegettersetter {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       ATM atm = new ATM();
        System.out.println("Lutfen isminizi giriniz.");
        String isim = input.nextLine();
        atm.setIsim(isim);
        System.out.println("Lutfen soyisminizi giriniz.");
        String soyisim = input.nextLine();
        atm.setIsim(soyisim);
        System.out.println("Lutfen bakiyenizi giriniz.");
        int bakiye = input.nextInt();
        atm.setBakiye(bakiye);
        
        atm.havaleAl(800);
        atm.havaleEt(57154);
        atm.paraYatir(84156);
        atm.paraCek(48485);
        atm.hesapGoster();
        
        
        
    }
}
