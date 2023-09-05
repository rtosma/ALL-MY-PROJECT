#include <stdio.h>

int main()
{
	int n,s;
	printf("1'den N'e kadar olan sayilari yazdiran algoritma....\n");
	printf("-----------------------------------------------------------\n");
	printf("Lutfen N degerini giriniz:"),
	scanf("%d",&n);
	
	art:
	
	s=s+1;
	
	printf("%d\n",s);
	
	if(s<n){
		goto art;
	}
	
	
	
	return 0;
}
