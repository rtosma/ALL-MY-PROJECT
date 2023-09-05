#include <stdio.h>

int main()
{
	int n,s=2;
	printf("1'den N'3 kadar olan cift sayilari bastiran algoritma..");
	
	printf("Lutfen N degerini giriniz:");
	scanf("%d",&n);
	
	art:
		
		if(s<n)
		{
			printf("%d\n",s);
			s = s+2;
			
			goto art;
		}
	
	
	
	
	
	
	
	
	return 0;
	
}
