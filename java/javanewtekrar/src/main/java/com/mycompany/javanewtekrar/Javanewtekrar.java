/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javanewtekrar;

import java.util.Scanner;

/**
 *
 * @author RECEP OSMA
 */
public class Javanewtekrar {

    public static void main(String[] args) {
        kullanici user = new kullanici();
        Scanner input = new Scanner(System.in);
        String isim = input.nextLine();
        user.setIsim(isim);
        String soyisim = input.nextLine();
        user.setSoyisim(soyisim);
        int yas = input.nextInt();
        user.setYas(yas);
        System.out.println("---------------------------------------------------");
        user.bilgiGoster();
        
        
        
        
        
        /*user.bilgiGoster();
        user.setIsim("Recep");
        System.out.println(user.getIsim());
        user.setSoyisim("OSMA");
        System.out.println(user.getSoyisim());
        user.setYas(21);
        System.out.println(user.getYas());
*/
    }
}
