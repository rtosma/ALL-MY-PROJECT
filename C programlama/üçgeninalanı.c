#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <conio.h>

int main(){
	char *locale;
     locale = setlocale(LC_ALL, "");
     
     int taban,yukseklik,alan;
     printf("Taban �l��s�n� giriniz:");
     scanf("%d",&taban);
     printf("Y�kseklik de�erini giriniz:");
     scanf("%d",&yukseklik);
     
     alan=(taban*yukseklik)/2;
     
     printf("\n\n Alan:%d" ,alan);
     
     
	
	
	return 0;
}
