#include <stdio.h>
int main()
{
	/*
	0-100 adet --> adet fiyatı = 10 tl
	100-150 ADET--> adet fiyatı = 9.5 tl
    150-200 ADET--> adet fiyatı = 9 tl
	200-250 ADET--> adet fiyatı = 8.5  tl
	250-300 ADET--> adet fiyatı = 8  tl
	300-350 ADET--> adet fiyatı = 7.5 tl
	350-400 ADET--> adet fiyatı = 7  tl
	400+    ADET--> adet fiyatı = 6.5 tl
	*/
    int adet;
    float adetFiyati,toplamFiyat;
    
    printf("Lutfen adet sayisini giriniz: \n");
    scanf("%d",&adet);
    
    if(adet >= 400)
	{
   	adetFiyati = 6.5;	
	}
	else if(adet>=350 && adet<=400)
	{
			adetFiyati = 7;
	}
	else if(adet>=300 && adet<=350)
	{
			adetFiyati = 7.5;
	}
	else if(adet>=250 && adet<=300)
	{
			adetFiyati = 8;
	}
	else if(adet>=200 && adet<=250)
	{
			adetFiyati = 8.5;
	}
    else if(adet>=150 && adet<=200)
    {
    		adetFiyati = 9;
	}
    else if(adet>=100 && adet<=150)
    {
    		adetFiyati = 9.5;
	}
    else if(adet>0 && adet<=100)
    {
    	adetFiyati = 10;
	}
	
	
	toplamFiyat = adet*adetFiyati;
	printf("Alicaginiz urunun toplam fiyati:%2f",toplamFiyat);
	
	
	return 0;
}
