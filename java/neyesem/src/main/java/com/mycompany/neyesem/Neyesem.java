/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.neyesem;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author RECEP OSMA
 */
public class Neyesem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tercih;

        System.out.println("bugün ne yemek yapayım");
        System.out.println("lutfen yemek secmek icin bir rakam seciniz 1 veya 2");
        tercih = input.nextInt();

        switch (tercih) {

            case 1 :  {
                String[] corbalar = {"tarhana", "mercimek", "ayranlıcorba", "sehriye", "tavukcorbası"};

                Random rnd = new Random();
                int index = rnd.nextInt(corbalar.length);
                String secilenCorba = corbalar[index];

                System.out.println("secilen corba : " + secilenCorba);
            }
            break;

            
            case 2 :
        
        {
        String[] anaYemek = {"tavuklupilav", "et", "tepsiKebap", "patatesliTepsi", "haslama"};

                Random rnd = new Random();
                int index = rnd.nextInt(anaYemek.length);
                String secilenYemek = anaYemek[index];

                System.out.println("secilen yemek: " + secilenYemek);
    
    }
    break;

        }
        
        
        

    }
}
