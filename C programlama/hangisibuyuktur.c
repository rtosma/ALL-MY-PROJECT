#include <stdio.h>
int main()
{ int num1, num2;
printf("iki sayi giriniz:");
scanf("%d%d", &num1, &num2);
switch(num1 > num2)
{ case 0: printf("%d sayisi en buyuktur.", num2);
break;
case 1: printf("%d sayisi en buyuktur.", num1); break;
}
return 0;
}
