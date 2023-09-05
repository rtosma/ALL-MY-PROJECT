#include <stdio.h>

int main(){
	int sayi1,sayi2,sayi3,enbuyukdeger;
	
	printf("Lutfen 1. sayiyi giriniz:");
	scanf("%d",&sayi1);
	printf("Lutfen 2. sayiyi giriniz:");
	scanf("%d",&sayi2);
	printf("Lutfen 3. sayiyi giriniz:");
	scanf("%d",&sayi3);
	
	if(sayi1>sayi2){
		
		if(sayi1>sayi2){
			enbuyukdeger = sayi1;
			
		}
		else{
			enbuyukdeger = sayi3;
		}
	}
	else{
		if(sayi2>sayi3){
			enbuyukdeger= sayi2;
		}
		else{
			enbuyukdeger = sayi3;
		}
	}
	
	printf("Girmis oldugunuz sayilardan en buyugu = %d",enbuyukdeger);
	
	
	
	
	return 0;
}
