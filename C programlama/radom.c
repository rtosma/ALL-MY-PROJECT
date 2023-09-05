#include <stdio.h>
#include <time.h>
#include <stdlib.h>
int main(){
int tutulan_sayi,tahmin,deneme=0;
srand(time(NULL));
tutulan_sayi=rand()%20+1;

do{
	printf("Tutulan sayiyi tahmin ediniz [1-20]:");
	scanf("%d",&tahmin);
	if(tutulan_sayi>tahmin)
	printf("Tutulan  sayi daha büyüktür:\n");
	else if(tutulan_sayi<tahmin)
	printf("Tutulan sayi daha kücüktür:\n");
	else
	printf("Tebrikler bildiniz!\n");
	deneme++;
}
while (tutulan_sayi!=tahmin);
printf("Tahmin sayiniz:%d",deneme);
return 0;
}

