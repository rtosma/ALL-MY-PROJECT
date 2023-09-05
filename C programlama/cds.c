#include <stdio.h>
#include <time.h>

int main()
{
	int rastgele;
	srand(time(NULL));
	rastgele=rand()%50;
	printf("%d",rastgele)
	;
	return 0;
	
}
