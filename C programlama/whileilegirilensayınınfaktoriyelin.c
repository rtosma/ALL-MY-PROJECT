#include <stdio.h>

int main(){
	
int num,faktoriyel=1;
printf("Bir pozitif tam sayi giriniz: ");
scanf("%d",&num);
	
while(num>0)
{
	faktoriyel*=num;
	num--;
	
	}	
	printf("Faktoriyel=%d",faktoriyel);
	
	
	return 0;
}
