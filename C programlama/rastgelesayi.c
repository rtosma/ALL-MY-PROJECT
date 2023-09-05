#include <stdio.h>
#include <time.h>
#include <std.lib>
int main()
{
	int rastgele,i;
	srand(time(NULL));
	
	for(i=1;i<=10;i++){
	
	rastgele = rand()%20+5;
	printf("%d \n",rastgele);
}
	
	
	return 0;
}
