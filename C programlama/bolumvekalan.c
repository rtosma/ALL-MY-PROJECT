#include <stdio.h>
#include <locale.h>
int main(){

//Turkce karakter sorunu cozumu
     char *locale;
     locale = setlocale(LC_ALL, "");
     
     int sayi1,sayi2,bolum,kalan;
     printf("\n Birinci Sayiyi Giriniz:");
     scanf("%d",&sayi1);
     printf("\n ikinci Sayiyi Giriniz:");
     scanf("%d",&sayi2);

bolum=sayi1/sayi2;
kalan=sayi1%sayi2;

printf("Bolum=%d \n ",bolum);
printf("Kalan=%d \n",kalan);

return 0;
}     
     

