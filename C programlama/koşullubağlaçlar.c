#include <stdio.h>
int main(){
	
	int vize1,vize2,final;
	double ortalama;
	printf("Birinci vize notunuzu giriniz:");
	scanf("%d",&vize1);
	
	printf("Ýkinci vize notunuzu giriniz:");
	scanf("%d",&vize2);
	
	printf("Final notunuzu giriniz:");
	scanf("%d",&final);
	

	ortalama = (vize1*30+vize2*30+final*40)/100;
	printf("Ortalamaniz : %2.lf\n",ortalama);
	
	
	if(ortalama < 50){
		printf("Sýnýfta kaldýnýz");
	}
	else if(ortalama == 50){
		printf("Geçtiniz");
	}
	
	else{
	printf("Gectiniz");
	}
	
	
		return 0;
}
