#include <stdio.h>
#include <time.h>

int main(){
	int i,a[10],bir=0,iki=0,uc=0,dort=0,bes=0,alti=0;
	srand(time(NULL));
	
	for(i=0;i<10;i++)
	{
		a[i]=rand()%6+1;
		
		if(a[i]==1)
		bir++;
		else if(a[i]==2)
		iki++;
		else if(a[i]==3)
		uc++;
		else if(a[i]==4)
		dort++;
		else if(a[i]==5)
		bes++;
		else
		alti++;
		printf("%d. zarda gelen rakam=%d\n",i+1,a[i]);
		
	}
	printf("% d kere 1 geldi\n",bir);
	printf("% d kere 2 geldi\n",iki);
	printf("% d kere 3 geldi \n",uc);
	printf("% d kere 4 geldi \n",dort);
	printf("% d kere 5 geldi \n",bes);
	printf("% d kere 6 geldi \n",alti);
	
	return 0;
}
