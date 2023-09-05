#include <stdio.h>
int main(){
  int i=1,num,fakt=1;
  printf("Sayi giriniz:");
  scanf("%d",&num);
  while(i<=num)
	{
		fakt*=i;
		i++;
		
		
	}
	
	printf("%d!=%d",num,fakt);
	return 0;
}
