#include <stdio.h>
#include <math.h>



int main()
{
	

    int toplama,cikarma,carpma,bolme,sayi1,sayi2;
    float sonuc;
    char islem;
    printf("Toplamak icin: +\n��karmak i�in: - \nBolmek i�in : / \n�arpmak i�in : * \n");
    scanf ("%c",&islem);
    
    if (islem=='+')
    {
    printf("toplama i�lemi \n");
    printf ("sayi giriniz");
    scanf("%d",&sayi1);
    printf("bir say� daha giriniz");
    scanf("%d",&sayi2);
    sonuc=sayi1+sayi2;
    printf("sonuc=%f \n",sonuc );
    }
    else if (islem=='-')
    {
    printf("��karma i�lemi \n");
    printf ("sayi giriniz");
    scanf("%d",&sayi1);
    printf("bir say� daha giriniz");
    scanf("%d",&sayi2);
    sonuc=sayi1-sayi2;
    printf("sonuc=%f \n",sonuc );
    }
    else if (islem=='*')
    {
    printf("carpma i�lemi \n");
    printf ("sayi giriniz");
    scanf("%d",&sayi1);
    printf("bir say� daha giriniz");
    scanf("%d",&sayi2);
    sonuc=sayi1*sayi2;
    printf("sonuc=%f \n",sonuc );
    }
    else if (islem=='/')
    {
    printf("b�lme i�lemi \n");
    printf ("sayi giriniz");
    scanf("%d",&sayi1);
    printf("bir say� daha giriniz");
    scanf("%d",&sayi2);
    sonuc=sayi1/sayi2;
    printf("sonuc=%f \n",sonuc );
    }

    return 0;
}
