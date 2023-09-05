#include <stdio.h>
#include <time.h>

int main()
{
	int i,rastgele;
	srand(time(NULL));
	
	for(i=0;i<=10;i++)
	{
		rastgele=rand()%20+10;
		printf("%d \n",rastgele);
	}
	
	return 0;
}
