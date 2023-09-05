#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <conio.h>

int main(){
	char *locale;
     locale = setlocale(LC_ALL, "");
     
     int taban,yukseklik,alan;
     printf("Taban ölçüsünü giriniz:");
     scanf("%d",&taban);
     printf("Yükseklik deðerini giriniz:");
     scanf("%d",&yukseklik);
     
     alan=(taban*yukseklik)/2;
     
     printf("\n\n Alan:%d" ,alan);
     
     
	
	
	return 0;
}
