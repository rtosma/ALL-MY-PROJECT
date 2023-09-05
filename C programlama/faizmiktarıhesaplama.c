#include <stdio.h>

int main(){
	int anapara,oran,yil,BF;
	
	printf("Anapara miktarini giriniz:");
	scanf("%d",&anapara);
	printf("Faiz oraninini giriniz:");
	scanf("%d",&oran);
	printf("Yili giriniz:");
	scanf("%d",&yil);
	
	BF=(anapara*yil*oran)/100;
	printf("Faiz miktarý = %d",BF);
	
	
	
	
	
	
	
	
	return 0;
	
}
