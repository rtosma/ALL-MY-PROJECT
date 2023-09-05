#include <stdio.h>

int main()
{
	
	
	int secenek;
	float fiyat,sonfiyat;
	
	printf("Urunlerin vergili fiyatlarini hesaplayan algoritma.\n");
	printf("------------------------------------------------------\n");
	printf("Gida icin 0'a basiniz\n");
	printf("Elektronik esyalar icin 1'e basiniz\n ");
	printf("Ev esyalari icin 2'ye basiniz\n");
	printf("Vergili fiyatini hesaplamak istediginiz urunu seciniz:\n");
	scanf("%d",&secenek);
	printf("Sectiginiz urunun fiyatini giriniz:");
		scanf("%f",&fiyat);
		sonfiyat=(fiyat*18)/100+fiyat;
	switch(secenek)
	{
		case 0: printf("Sectiginiz gidanin vergili fiyati:%.2f",sonfiyat);break;
		case 1: printf("Sectiginiz elektronik cihazin vergili fiyati:%.2f",sonfiyat);break;
		case 2: printf("Sectiginiz esyanin vergili fiyati:%.2f",sonfiyat);break;
	}

	
	
	
	
	
	
	
	return 0;
}
