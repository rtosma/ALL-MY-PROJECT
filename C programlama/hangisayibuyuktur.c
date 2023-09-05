#include <stdio.h>

int main()
{
   int sayi1,sayi2;
   printf("Lutfen  birinci sayiyi giriniz:");
   scanf("%d",&sayi1);
   printf("Lutfen ikinci sayiyi giriniz:");
   scanf("%d",&sayi2);
   
   if(sayi1>sayi2)
   {
   	printf("Birinci sayi ikinci sayidan buyuktur.");
   }
	else
	{
		printf("İkinci sayi birinci sayidan buyuktur.");
	}
	
	
	
	
	return 0;
}
