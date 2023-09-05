#include <stdio.h>

int main(){
	
	int i,j,k;
	
	printf("AxA tipindeki carpim tablosu icin A degerini giriniz:");
	scanf("%d",&k)
	;
	
	for(i=1;i<k;i++){
		for(j=1;j<k;j++);
		printf("%d x %d=%d\n",i,j,i*j);
	}
	
	
	return 0;
}
