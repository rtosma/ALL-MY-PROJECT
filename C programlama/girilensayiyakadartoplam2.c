int toplam (int num);

#include <stdio.h>

int main()

{

  int sayi,sonuc;

  printf("Pozitif bir sayý giriniz: ");

  scanf("%d",&sayi);

  sonuc=toplam(sayi);

  printf("Toplam deðeri:%d",sonuc);

  return 0;

}

int toplam (int num)

{

  if(num!=0)

  return num+toplam(num-1); //toplam() kendisini çaðýrmasý

  else

  return num;

}
