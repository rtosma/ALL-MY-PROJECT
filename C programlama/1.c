#include <stdio.h>

int main()
{
int i,ilksayi,sonsayi,toplam=0;
printf("Alt limit giriniz:");
scanf("%d",&ilksayi);
printf("�st limit giriniz:");
scanf("%d",&sonsayi);

if(ilksayi%2!=0);
{
    ilksayi++;
}
for(i=ilksayi; i<=sonsayi; i+=2);
{
    toplam+=i;
}
printf("%d ve %d ars�ndaki �ift say�lar�n toplam�=%d",ilksayi,sonsayi,toplam);
    return 0;
}
