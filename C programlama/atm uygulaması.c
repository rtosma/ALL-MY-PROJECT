int main()
{
    int islem,miktar,bakiye=1000;
    char yeniden='e';
    
    printf("1-bakiye sorgulama,2-para cekme,3-para yatirma");
    while(yeniden=='e')
    {
       printf("l�tfen i�leminizi giriniz");
       scanf("%d",&islem);
       switch(islem)
       {
           case 1:
           printf("bakiyeniz %d tl'dir",bakiye);
           break;
           case 2:
           printf("miktar giriniz:");
           scanf("%d",&miktar);
           bakiye-=miktar;
           printf("bakiyeniz %d tl'dir",bakiye);
           break;
           case 3:
               printf("miktar giriniz:");
               scanf ("%d",&miktar);
               bakiye+=miktar;
                 printf("bakiyeniz %d tl'dir",bakiye);
                 break;
                 default:
                 printf("ge�ersiz bir i�lem girdiniz!");
                 break;
       }
       printf("nyeniden i�lem i�lem yapmak ister misiniz? e/h");
       scanf("%s",&yeniden);
    }
    printf("g�r��mek dile�iyle");

    return 0;
}
