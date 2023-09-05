#include <stdio.h>
#include <math.h>

int toplama(int x,int y);
int cikarma(int x,int y);
int carpma(int x,int y);
int bolme(int x,int y);
float ustel(int x,int y);
float kok(int x);

int main(){
	int x,y,m;
	printf("Lutfen x ve y sayisini giriniz:\n"),
	scanf("%d%d",&x,&y);
	printf("Hangi islemi yapmak istiyorsunuz:\n 1-Toplama \n 2-Cikarma \n 3-Carpma \n 4-Bolme \n 5-Ustel \n 6-Karekök: \n");
	scanf("%d",&m);
	
	switch(m)
	{
		case 1:printf("Sonuc=%d \n",toplama(x,y));break;
		case 2:printf("Sonuc=%d \n",cikarma(x,y));break;
		case 3:printf("Sonuc=%d \n",carpma(x,y));break;
		case 4:printf("Sonuc=%d \n",bolme(x,y));break;
		case 5:printf("Sonuc=%f \n",ustel(x,y));break;
		case 6:printf("Sonuc=%f \n",kok(x));break;
		default:printf("Cikis!!!\n");break;
		
	}
	return 0;
}


	int toplama(int a,int b){
		return a+b;
	}
	int cikarma(int a,int b){
		return a-b;
	}
	int carpma(int a,int b){
		return a*b;
	}
	int bolme(int a,int b){
		return a/b;
	}
	float ustel(int a,int b){
		return pow(a,b);
	}
	float kok(int a){
		return sqrt(a);
	}

