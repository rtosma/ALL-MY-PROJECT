#include <stdio.h>

int main(){
	int i,k,f;
	printf("Faktoriyelini hesaplamak istediginiz degeri giriniz:");
	scanf("%d",&k);
	
	for(i=1;i<k;i++)
	{
		f *=i;
	}
		printf("%d faktoriyelin faktoriyeli=%d\n",k,f);

	
	
	
	return 0;
}
