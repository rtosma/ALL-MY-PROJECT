#include <stdio.h>

int main(){
       
        int mDiziBir[2][2], mDiziIki[2][3], mDiziSonuc[2][6]={0};
        int i, j, k;
       
        printf("Birinci Matrisi Giriniz\n");
        for(i=0; i<2; i++)
                for(j=0; j<2; j++){
                        printf("[%d][%d]= ", i+1, j+1);
                        scanf("%d", &mDiziBir[i][j]);
                }
 
        printf("ikinci Matrisi Giriniz\n");
        for(i=0; i<2; i++)
                for(j=0; j<3; j++){
                        printf("[%d][%d]= ", i+1, j+1);
                        scanf("%d", &mDiziIki[i][j]);
                }      
       
        printf("Sonuc\n");
        for(i=0; i<2; i++){
                for(j=0; j<6; j++){            
                        for(k=0; k<2; k++){
                                mDiziSonuc[i][j] += mDiziBir[i][k] * mDiziIki[k][j];
                        }
                        printf("%d ", mDiziSonuc[i][j]);
                }
       
                        printf("\n");
        }
          
        
        return 0;
 
}
