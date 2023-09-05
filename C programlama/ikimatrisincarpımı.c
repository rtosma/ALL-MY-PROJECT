 #include <stdio.h>

 int main(){
 	
 	int matrisbir[2][2];
 	int matrisiki[2][2];
 	int islemsonucu[2][2];
 	
 
 	printf("Lutfen 1.matrisi giriniz:\n");
 	for(int i=0;i<2;i++)
 	for(int j=0;j<2;j++){
 		printf("[%d][%d] Elemanini Giriniz:",i+1,j+1);
 		scanf("%d",&matrisbir[i][j]);
	 }
	 
	 printf("Lutfen 2.matrisi giriniz:\n");
 	for(int i=0;i<2;i++)
 	for(int j=0;j<2;j++){
 		printf("[%d][%d] Elemanini Giriniz:",i+1,j+1);
 		scanf("%d",&matrisiki[i][j]);
	 }
	 
	 printf("Matrislerin Carpimi:\n");
	 for(int i=0;i<2;i++){
	 	for(int j=0;j<2;j++){
	 		for(int x=0;x<2;x++){
	 			islemsonucu[i][j] += matrisbir[i][x]*matrisiki[x][j];
			 }
			 printf("%d",islemsonucu[i][j]);
		 }
		 printf("\n");
	 }
	 
	
	 return 0;
 	
 }
