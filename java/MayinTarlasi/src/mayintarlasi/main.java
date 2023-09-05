/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mayintarlasi;

import java.util.Scanner;

/**
 *
 * @author RECEP OSMA
 */
public class main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int row,column;
        System.out.println("Mayin Tarlasina Hosgeldiniz");
        System.out.println("Lutfen oynamak istediginiz boyutlari giriniz");
       // System.out.println("Satır Sayısı: ");
        //row = scan.nextInt();
        //System.out.println("Sutün Sayısı");
        //column = scan.nextInt();
        
        MayinTarlasi mayin = new MayinTarlasi(5, 5);
        mayin.run();
    }
}
