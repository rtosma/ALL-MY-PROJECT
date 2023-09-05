#include <stdio.h>

int main(){
	int num,sayac,topla=0;
	printf("sayi gir:");
	scanf("%d",&num);
	
	while(sayac<=num)
	{
		topla+=sayac;
		sayac++;
	}
	printf("%d",topla);
	
	return 0;
	
}
