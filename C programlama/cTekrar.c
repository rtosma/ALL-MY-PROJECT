#include <stdio.h>

int main(){
	//Sözde Kod
	
	/*Eger ogrencinin notu 40 tsn buyuk veya esitse
	"Gecti yaz"
    Degilse
    "Kaldý yaz"
	*/
	int notunuz;
	printf("Lutfen notunuzu giriniz:");
	scanf("%d",&notunuz);
	
	if(notunuz>=40){
		printf("Gectiniz");
		
	}
	else{
		printf("Kaldýnýz");
	}
	return 0;
}
