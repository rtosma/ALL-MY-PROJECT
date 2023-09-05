#include <stdio.h>

int main()
{
	int sayi1,carpim,karen;
	
	
	
 	art:
	
	printf("Karesi alinacak sayiyi giriniz:");
	scanf("%d",&sayi1);
	
	if(sayi1>0)
	{
		kare=sayi1*sayi1;
		printf("%d sayinizin karesi %d'dir.",sayi1,kare);
	}
	else
	{
		printf("Lutfen 0'dan buyuk bir sayi giriniz:");
		goto art;
	}
	
	
	
	
	
	
	
	return 0;
}
