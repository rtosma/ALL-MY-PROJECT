#include <stdio.h>

int main(){
	
	int sayi,number,sonuc=0,kalan;
	printf("bir sayi giriniz:");
	scanf("%d",&sayi);
	
	number = sayi;
	
	while(number !=0)
	{
		kalan = number%10;
		sonuc += kalan*sonuc*kalan;
		number /= 10;
	}
	
	if(sonuc == sayi){
		printf("%d Armstrong sayidir.",sayi);
	}
	
	else{
		printf("%d Armstrong sayi degildir.",sayi);
	}
	
	return 0;
}
