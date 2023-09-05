#include <stdio.h>


int main(){
       
        int matris1[2][2], matris2[2][3], islemsonucu[2][6]={0};
        int x, y, z;
       
        printf("Lutfen Birinci Matrisi Giriniz:\n");
        for(x=0; x<2; x++)
                for(y=0; y<2; y++){
                        printf("[%d][%d]= ", x+1, y+1);
                        scanf("%d", &matris2[x][y]);
                }
 
        printf("Lutfen ikinci Matrisi Giriniz\n");
        for(x=0; x<2; x++)
                for(y=0; y<3; y++){
                        printf("[%d][%d]= ", x+1, y+1);
                        scanf("%d", &matris2[x][y]);
                }      
       
        printf("Matrislerin Carpimi:\n");
        for(x=0; x<2; x++){
                for(y=0; y<6; y++){            
                        for(z=0; z<6; z++){
                                islemsonucu[x][y] += matris1[x][z] * matris2[z][y];
                        }
                        printf("%d ", islemsonucu[x][y]);
                }
       
                        printf("\n");
        }
          
        
        return 0;
 
}
