#include <stdio.h>
#include <math.h>



int main()
{
	

    int toplama,cikarma,carpma,bolme,sayi1,sayi2;
    float sonuc;
    char islem;
    printf("Toplamak icin: +\nÇýkarmak için: - \nBolmek için : / \nÇarpmak için : * \n");
    scanf ("%c",&islem);
    
    if (islem=='+')
    {
    printf("toplama iþlemi \n");
    printf ("sayi giriniz");
    scanf("%d",&sayi1);
    printf("bir sayý daha giriniz");
    scanf("%d",&sayi2);
    sonuc=sayi1+sayi2;
    printf("sonuc=%f \n",sonuc );
    }
    else if (islem=='-')
    {
    printf("çýkarma iþlemi \n");
    printf ("sayi giriniz");
    scanf("%d",&sayi1);
    printf("bir sayý daha giriniz");
    scanf("%d",&sayi2);
    sonuc=sayi1-sayi2;
    printf("sonuc=%f \n",sonuc );
    }
    else if (islem=='*')
    {
    printf("carpma iþlemi \n");
    printf ("sayi giriniz");
    scanf("%d",&sayi1);
    printf("bir sayý daha giriniz");
    scanf("%d",&sayi2);
    sonuc=sayi1*sayi2;
    printf("sonuc=%f \n",sonuc );
    }
    else if (islem=='/')
    {
    printf("bölme iþlemi \n");
    printf ("sayi giriniz");
    scanf("%d",&sayi1);
    printf("bir sayý daha giriniz");
    scanf("%d",&sayi2);
    sonuc=sayi1/sayi2;
    printf("sonuc=%f \n",sonuc );
    }

    return 0;
}
