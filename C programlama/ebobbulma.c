#include <stdio.h>
#include <math.h>

int main()
{
	int sayi1,sayi2,buyuksayi,kucuksayi,kalan;
	
	do{
	
	
	printf("Lutfen EBOB degerini bulmak istdeginiz iki sayiyi giriniz:");
	scanf("%d%d",&sayi1,&sayi2);
	
      }
	while(sayi1 <= 0 || sayi2 <= 0);
	
	if(sayi1>sayi2){
		buyuksayi=sayi1;
		kucuksayi=sayi2;
		
	}
	else{
		buyuksayi = sayi2;
		kucuksayi = sayi1;
	}
	
	kalan =buyuksayi % kucuksayi;
	
	while(kalan !=0){
	
	if(kalan >= buyuksayi){
		buyuksayi=kalan;
	}
	else{
	
	buyuksayi=kucuksayi;
	kucuksayi=kalan;
}
	kalan= buyuksayi % kucuksayi;
	
	}
	
	printf("EBOB(%d%d) = %d" ,sayi1,sayi2,kucuksayi);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
