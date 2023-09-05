#include <stdio.h>

int main(){
	int num,sayac,topla=0;
	printf("sayi gir");
	scanf("%d",&num);
	
	for(sayac=1;sayac<=num;sayac++)
	{
		topla+=sayac;
		
	}
	printf("%d",topla);
	
	return 0;
	
}
