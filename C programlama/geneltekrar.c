#include <stdio.h>


int main(){
	
	/*
	//Kullan�c�dan boy ve cinsiyet al sonras�nda erkek ise 170 kad�n ise 160 �zerinde olmazsa ele.
	
	*/
	
	int boy;
	char cinsiyet;
	printf("Lutfen cinsiyetinizi giriniz:\n");
	scanf("%c",&cinsiyet);
	
	printf("Lutfen boyunuzu giriniz:\n");
	scanf("%d",&boy);
	if((cinsiyet == 'E' || cinsiyet == 'e') && boy >=170)
	{
		printf("Mulakati Gectiniz Tebrikler.....\n");
	}
	if((cinsiyet == 'K' || cinsiyet == 'k') && boy >=160)
	{
	    printf("Mulakati Gectiniz Tebrikler.....\n");	
   	}
   	
   	else
	   {
	   	printf("Mulakattan Kaldiniz Bir Daha ki Sefere Insallah...");
	   }



	return 0;	
}
