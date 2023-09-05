#include <stdio.h>

int main()
{
int i,ilksayi,sonsayi,toplam=0;
printf("Alt limit giriniz:");
scanf("%d",&ilksayi);
printf("Üst limit giriniz:");
scanf("%d",&sonsayi);

if(ilksayi%2!=0);
{
    ilksayi++;
}
for(i=ilksayi; i<=sonsayi; i+=2);
{
    toplam+=i;
}
printf("%d ve %d arsýndaki çift sayýlarýn toplamý=%d",ilksayi,sonsayi,toplam);
    return 0;
}
