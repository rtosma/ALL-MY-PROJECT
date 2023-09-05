#include <stdio.h>

int main()
{
	double sayi,s,f=1;
	printf("Faktoriyeli bulunacak sayiyi giriniz:");
	scanf("%lf",&sayi);
	
	
	art:
	
	s++;
	
	if(s<=sayi){
		f=f*s;
		goto art;
		
	}
	printf("%.2lf nin faktoriyeli %.2lf dir,",sayi,f);
	
	
	
	
	
	
	
	return 0;
}
