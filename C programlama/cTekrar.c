#include <stdio.h>

int main(){
	//S�zde Kod
	
	/*Eger ogrencinin notu 40 tsn buyuk veya esitse
	"Gecti yaz"
    Degilse
    "Kald� yaz"
	*/
	int notunuz;
	printf("Lutfen notunuzu giriniz:");
	scanf("%d",&notunuz);
	
	if(notunuz>=40){
		printf("Gectiniz");
		
	}
	else{
		printf("Kald�n�z");
	}
	return 0;
}
