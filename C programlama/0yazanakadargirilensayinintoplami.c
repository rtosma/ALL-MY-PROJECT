#include <stdio.h>

int main(){
	double num,topla=0;
	
	do{
		printf("Bir sayi giriniz:");
		scanf("%lf",&num);
		topla+=num;
		}
	
	while(num!=0);
	printf("Toplam=%.2lf",topla);	
	return 0;
}

