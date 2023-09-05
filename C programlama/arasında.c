#include <stdio.h>

int main()
{
	int i,k,g;
	printf("Lutfen iki sayi giriniz:\n");
	scanf("%d%d",&k,&g);
	printf("%d ile %d arasindaki sayilar\n\n",k,g);
	for(i=k+1;i<g;i++)
	{
		printf("%d \n",i);
	}
	
	
	
	
	
	
	return 0;
}

