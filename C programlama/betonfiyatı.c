#include <stdio.h>
int main()
{
	int betontercihi,sonfiyat,fiyat;
	
	printf("1-C25 Beton(duvar,karakas temel,) 2-C30 Beton(yýgma temel,ev insaati),3-C35(ev insaati,tabliye,kolon\n)");
	printf("----------------------------------------------------\n"),
	printf("Lutfen almak istediginiz beton sinfini seciniz:\n");
	scanf("%d",&betontercihi);
	
	switch(betontercihi)
	{
		case 1:printf("C25 beton fiyati kdv dahil 400 TL");break;
		case 2:printf("C30 beton fiyati kdv dahil 650TL");break;
		case 3:printf("C35 beton fiyati kdv dahil 900 TL");break;
	}
	
	
	
	
	
	return 0;
}
