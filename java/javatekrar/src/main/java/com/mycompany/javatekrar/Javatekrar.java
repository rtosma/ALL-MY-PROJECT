/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javatekrar;

import java.util.Arrays;

/**
 *
 * @author RECEP OSMA
 */
public class Javatekrar {
    
    
    
    //Fonksiyonlar
    /*public static void kendiniTanit(){
        System.out.println("Adi: Caglar");
        System.out.println("Soyadi: Akar");
        System.out.println("Memleketi:Izmir");
    }
    */
           //-------------------------------------------------------------------
    /*
    public static void ortalamaAl(int sayi1,int sayi2)
    {
        int toplam = sayi1+sayi2;
        int ort = toplam/2;
        System.out.println("Sayıların ortalaması : "+ort);
    }*/
          //--------------------------------------------------------------------
     /*public static void ortalamaAl(int sayi1,int sayi2)
    {
        int toplam = sayi1+sayi2;
        double ort = (double)toplam/2;
        System.out.println("Sayilarin ortalamasi : "+ort);
    }
    */
    //--------------------------------------------------------------------------
    /*
    public static void enBuyuk(int sayi1,int sayi2)
    {
        if (sayi1>sayi2) {
            System.out.println(sayi1+"  "+sayi2+"'den buyuktur.");
            
        }
        else if (sayi1<sayi2) {
            System.out.println(sayi2+"  "+sayi1+"'den buyuktur.");
            
        }
        else {
            System.out.println("sayilar esittir.");
        }
    }
    */
    /*
      public static double ortalamaAl(int sayi1,int sayi2)
    {
        int toplam = sayi1+sayi2;
        double ort = (double)toplam/2;
        System.out.println("Sayıların ortalaması : "+ort);
        return ort;
    }
    
    */
    
    public static void main(String[] args) {
        
        //ortalamaAl(84, 85);
        
        //en buyuk sayiyi bulan program
        /*
           Scanner input = new Scanner(System.in);
           System.out.println("Lutfen 1. sayiyi giriniz:");
           int sayi1=input.nextInt();
           System.out.println("Lutfen 2. sayiyi giriniz:");
           int sayi2=input.nextInt();
           enBuyuk(sayi1, sayi2);
        */
           
           
           
           
           
           //kalvyeden girilen sayilarin ortalamasını alan fonksiyon
           /*
           System.out.println("Lutfen 1. sayiyi giriniz:");
           int sayi1=input.nextInt();
           System.out.println("Lutfen 2. sayiyi giriniz:");
           int sayi2=input.nextInt();
           ortalamaAl(sayi1, sayi2);
           */
           
           
           
           //ortalamaAl(45, 58);//sayi ortalama fonksiyonu
           
           //kendiniTanit(); //fonksiyonu
           
           //-------------------------------------------------------------------
           //arrays fill metodu
           /*
           int size = 10;
           char [] karakterler = new char[10];
           Arrays.fill(karakterler,0,size/2,'A');
           Arrays.fill(karakterler,size/2,size,'B');
           System.out.println(Arrays.toString(karakterler));
           */
           
           //-----------------------------------
           //dizi tablo sayilardan
           /*
           int [][] dizi = new int[5][6];
           int sayi=0;
           
           for (int i = 0; i < dizi.length; i++) {
               
               for (int j = 0; j < dizi[i].length; j++) {
                   dizi[i][j]=sayi;
                   System.out.print(dizi[i][j]+" ");
                   sayi+=2;
                   
               }
               sayi+=8;
               System.out.println("");
            
        }
           */
           
           
           //-------------------------------------------------------------------
           //dizi tablo oluşturma
           /*
           int [][] dizi = {{0,5,10},{15,20,25},{30,35,40}};
           int toplam = 0;
              
              for (int i = 0; i <dizi.length; i++) {
                  toplam = 0;
                  for (int j = 0; j <dizi[i].length; j++) {
                      //println yerine print yazılırsa gelecek ifadeler altalta değilde yan yana yazılır
                      System.out.print(dizi[i][j]+" ");
                      toplam+=dizi[i][j];
                      
                  }
                  System.out.println(toplam);
        }
              System.out.println("Genel toplam: "+toplam);
           */
           
                   
                   
           
           
           
           
           //-------------------------------------------------------------------
           //diziler oran orantı 
           /*
           int [] dizi = new int[10];
           int ilkSontoplam = 0;
           int tumToplam = 0;
           for (int i = 0; i < 10; i++) {
               System.out.println("sayiyi giriniz: ");
               dizi[i] = input.nextInt();
               tumToplam+=dizi[i];
            
        }
           ilkSontoplam=dizi[0]+dizi[9];
           double oran = (double)ilkSontoplam/(double)tumToplam;
           System.out.println("------------------------");
           System.out.println("Dizinin Toplamı:"+tumToplam);
           System.out.println("------------------------");
           System.out.println("Ilk son toplam: "+ilkSontoplam);
           System.out.println("Oran : "+oran);
           */
           //-------------------------------------------------------------------
           //diziler 
           /*
            int [] sayilar = {15,75,41,25,4,9,12,42};
            
            
            for (int sayi:sayilar) {
                System.out.println( sayi+" ");
            
        }
            System.out.println("--------------------");
           
           */
           
           //-------------------------------------------------------------------
           //dizi yazdırma
           /*
           int [] sayilar = {15,75,41,25,4,9,12,42};
           
           for (int i = 0; i <sayilar.length; i++) {
               System.out.println(sayilar[i]);
            
        }
           */

           //------------------------------------------------------------------- 
           //diziler başlangıç
           /*
           int [] dizi = {12,53,18};
           
           System.out.println(dizi[2]);
           */
           
           //-------------------------------------------------------------------
           //carpim tablosu
          /*
           int carp = 1;
           
           for (int i = 0; i <=10; i++) {
               for (int j = 0; j <=10; j++) {
                   System.out.println(i+"x"+j+"="+(i*j));
               }
               System.out.println(" ");
        }
           */
           
           
           //-------------------------------------------------------------------
           //0 girilene kadar girilen sayilarin toplamı
           /*
           int toplam = 0;
           int sayi;
           do{
               System.out.println("Sayiyi giriniz:");
               sayi=input.nextInt();
               toplam+=sayi;
           }while(sayi!=0);
                   System.out.println("Toplam:"+toplam);
           */
        
        //----------------------------------------------------------------------
        //ifin farklı gösterimi
        /*
        boolean b1 = true;
        boolean b2 = true;
        
        int result = (b1 && b2)? 10:20;
        System.out.println(result);*/
        
        
        //1 girilene kadar devam eden döngü 
        /*
        System.out.println("Bir sayiyi giriniz:");
        int sayi;
        
        while(true)
        {
            System.out.println("sayiyi giriniz");
            sayi =input.nextInt();
            if ( sayi == 1)
            {
                break;
            }
        }
        
        System.out.println("Dongu gitti:");*/
        //----------------------------------------------------------------------
        //6'ya eşit odluğunda döngüden çıkan program
        /*
        int i= 1;
        while(i<=10)
        {
            if (i==6) {
                break;
                
            }
            System.out.println(i);
            i++;
           
        }
        System.out.println("dongu bitti");
        */
        
        //----------------------------------------------------------------------
        
        //1.sayidan 2.sayiya kadar olan çift sayilar
        /*
        System.out.println("1.sayiyi giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("2.sayiyi giriniz:");
        int sayi2 = input.nextInt();
        int i = sayi1;
        
        while(i<=sayi2)
        {
            if (i%2==0) {
                System.out.println(i+". cift sayi :"+i);
                
            }
            i++;
        }
        */
        
        //-------------------------------------------------------------------------
        
        //faktoriyel hesaplama
        /*int faktoriyel = 1;
        int sayi;
        
            System.out.println("Faktoriyelini bulmak istediğini sayiyi giriniz: ");
            sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++) {
            faktoriyel*=i;
            
        }
        System.out.println("Girilen sayinin faktoriyeli : "+faktoriyel);
        */
        
        
        
        
        
        
        //Kullanıcının girdiği 10 sayıyı toplayan yazılım
        /*
        int toplam =0;
        int sayi;
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+".sayiyi giriniz:");
            sayi = input.nextInt();
            toplam+=sayi;
        }
        
        System.out.println("Girilen sayilarin toplami: "+toplam);*/
        
        
        
        
        //While ile 10'a kadar saydırma
        /*int sayac=0;
        while(sayac<10)
        {
           sayac++;
           System.out.println(sayac);
        }*/
        
      
        
        
        
        
    }
}
