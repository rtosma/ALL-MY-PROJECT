#include <stdio.h>

const int sehir=2;
const int hafta=7;
int main(){
	int sicaklik[sehir][hafta];
	for(int i=0; i<sehir; i++){
		for(int j=0; j<hafta; j++){
			printf("Sehir %d, Gun %d:",i+1,j+1);
			scanf("%d",&sicaklik[i][j]);
		}
	}
	printf("\ Gosterilen deger:\n\n");
	for(int i=0; i<sehir;i++){
	for(int j=0; j<hafta,j++){
		printf("Sehir %d,Gun %d = Sıcaklık %d",i+1,j+1,sicaklik[i][j]);
	}
	}
	
	return 0;
}
