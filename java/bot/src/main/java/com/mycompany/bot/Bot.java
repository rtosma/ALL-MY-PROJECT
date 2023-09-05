/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bot;

import java.util.Scanner;

/**
 *
 * @author RECEP OSMA
 */
public class Bot {

   
        final static Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        selamlar("AI33", "2022"); 
        isminiHatirlat();
        yasTahmin();
        say();
        test();
    }
    public static void selamlar(String isimBot, String yilBot) {
        System.out.println("Merhaba Benim adim " + isimBot + ".");
        System.out.println("Ben, " + yilBot + " de yaratildim.");
        System.out.println("Lutfen ismini alayim.");
    }
    public static void isminiHatirlat() {
        String isim = scanner.nextLine();
        System.out.println("Ne guzel ismin var, " + isim + "!");
    }
    public static void yasTahmin() {
        System.out.println("Haydi yasini tahmin edeyim");
        System.out.println("Yasinin 3, 5 ve 7'ye bolumunu yaz");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Yasin " + age + "; bu programlamaya baslamak icin guzel yas!");
    }
    public static void say() {
        System.out.println("Simdi sana istedigim sayiya kadar sayabildigimi ispatlayacagim.");
        System.out.println("Saymami istedigin sayiyi gir:");
        int sayi = scanner.nextInt();
        for (int i = 0; i <= sayi; i++) {
            System.out.println(i+"!");
        }
    }
    public static void test() {
        System.out.println("Haydi programlama bilgini olcelim.");
        System.out.println ("Metodlari neden kullaniriz?");
        System.out.println ("1. Ayni ifadeyi tekrarlamak icin.");
        System.out.println ("2. Program akisini alt parcalara ayirmak icin.");
        System.out.println ("3. Programin akis zamanini belirlemek icin.");
        System.out.println ("4. Program akisini kesmek icin.");
        int secim = scanner.nextInt();
        
        switch(secim){
            case 1:
                System.out.println("Lutfen tekrar dene.");
                break;
            case 2:
                System.out.println("Tebrikler gorusuruz!");
                break;
            case 3:
                System.out.println("Lutfen tekrar dene.");
                break;
            case 4:
                System.out.println("Lutfen tekrar dene.");
                break;
            default:
                System.out.println("Lutfen dogru numara girin.");
        }
    }

}

    

