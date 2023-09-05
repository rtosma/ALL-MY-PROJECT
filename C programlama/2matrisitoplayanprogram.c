#include <stdio.h>

int main(){
	int i,j,satir,sutun,a[10][10], b[10][10];
	int toplam[10][10];
	
	printf("\n Luyfen satir ve sutun sayilarini giriniz:");
	scanf("%d%d",&i,&j);
	
	
	printf("\n Lutfen birinci matrisin elemanlarini giriniz:");
	for(satir=0; satir<i; satir++){
		for(sutun=0; sutun<j; sutun++){
			scanf("%d",&a[satir][sutun]);
			
		}
	}
	
	printf("\n Lutfen ikinci matrisin elemanlarini giriniz:");
	for(satir=0; satir<i; satir++){
		for(sutun=0; sutun<j; sutun++){
			scanf("%d",&b[satir][sutun]);
			
		}
	}
	
	for(satir=0; satir<i; satir++){
		for(sutun=0; sutun<j; sutun++){
		toplam[satir][sutun]=a[satir][sutun]+b[satir][sutun];
			
		}
	}
	
		printf("\n iki matrisin toplami a+b \n");
	for(satir=0; satir<i; satir++){
		for(sutun=0; sutun<j; sutun++){
			printf("%d \t",toplam[satir][sutun]);
			
		}
		printf("\n");
	}
	

 
  

  return 0;

}
