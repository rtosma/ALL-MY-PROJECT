#include <stdio.h>

int main()
{
int satir,sutun;

printf("Lutfen satir ve sutun sayilarini giriniz:\n");
scanf("%d%d",&satir,&sutun);

int dizi[satir][sutun];
for(int i=0;satir>i;i++){
	for(int j=0;sutun>j;j++){
		printf("Lutfen %d. satýr %d. sutundaki elemaný giriniz.\n",i+1,j+1);
		scanf("%d",&dizi[i][j]);
	}

}

for (int k=0;k<satir;k++)
{
	for(int m=0;m<sutun;m++){
		printf("%d ",dizi[k][m]);
	}
	printf("\n");
}
	
	

	return 0;	
}
