#include <stdio.h>

int main()
{
	
	int i,k,j;
	
	printf("A*A tipindeki carpim tablosu icin A degerini giriniz:");
	scanf("%d",&k);
	
	
	for (i=1;i<=k;i++)
	{
		for (j=1;j<=k;j++)
		{
			printf("%d*%d=%d\t",i,j,i*j);
		}
		printf("\n");
	}
	
	
	
	
	return 0;
}
