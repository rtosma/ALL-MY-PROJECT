#include <stdio.h>

int main()
{
	int i,g,x,y;
	x=5;
	y=3;
	printf("Lutfen bir deger giriniz");
	scanf("%d",&g);
	
	for(i=0;i<g;i++){
		if(i%x==0 || i%y==0)
		{
			printf("%d\n",i);
		}
	}
		
		
		
		return 0;

}
