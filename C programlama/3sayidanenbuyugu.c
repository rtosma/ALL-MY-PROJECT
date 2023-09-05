#include <stdio.h>

int main()
{
	int sayi1,sayi2,sayi3;
	
	printf("Lutfen 1. sayiyi giriniz.");
	scanf("%d",&sayi1);
	
	printf("Lutfen 2. sayiyi giriniz.");
	scanf("%d",&sayi2);
	
	printf("Lutfen 3. sayiyi giriniz.");
	scanf("%d",&sayi3);


	if(sayi1<sayi2)
	{
		printf("2.sayi 1.sayidan buyuktur.");
	}
	else if(sayi2<sayi1)
	{
		printf("1.sayi 2.sayidan buyuktur.");
	}
	else if(sayi2<sayi3)
	{
		printf("3.sayi 2.sayidan buyuktur.");
	}
	else if(sayi3<sayi2)
	{
		printf("2.sayi 3.sayidan buyuktur.");
	}
	else if(sayi3<sayi1)
	{
		printf("1.sayi 3.sayidan buyuktur.");
	}
	else if(sayi1<sayi3)
	{
		printf("3.sayi 1.sayidan buyuktur.");
	}
	
	
	
	
	
	
	
	
	
	
return 0;
	
}
