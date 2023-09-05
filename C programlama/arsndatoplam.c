#include <stdio.h>

int main()
{
	int i,k,g,toplam;
	printf("Lutfen iki sayi giriniz:\n");
	scanf("%d%d",&k,&g);
	printf("%d ile %d arasindaki sayilarin toplami\n\n",k,g);
	for(i=k+1;i<=g;i++)
	{
		toplam += i;
	}
		printf("sonuc = %d",toplam);
	return 0;
}

