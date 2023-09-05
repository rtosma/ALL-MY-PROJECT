	#include <stdio.h>
	#include <stdlib.h>
	#include <conio.h>
	#include <locale.h>
	
	int main(){
		
		char *locale;
     locale = setlocale(LC_ALL, "");
		
	int sayi1;
	int sayi2;
	int toplam;
	printf("Birinci Sayi:");
	scanf("%d",&sayi1);
	printf("Ikinci Sayi:");
	scanf("%d",&sayi2);
	
	toplam=sayi1+sayi2;
	printf("\n Toplam: %d" ,toplam);
	
	return 2;
	
	
	}
