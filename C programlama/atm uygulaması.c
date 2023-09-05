int main()
{
    int islem,miktar,bakiye=1000;
    char yeniden='e';
    
    printf("1-bakiye sorgulama,2-para cekme,3-para yatirma");
    while(yeniden=='e')
    {
       printf("lütfen iþleminizi giriniz");
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
                 printf("geçersiz bir iþlem girdiniz!");
                 break;
       }
       printf("nyeniden iþlem iþlem yapmak ister misiniz? e/h");
       scanf("%s",&yeniden);
    }
    printf("görüþmek dileðiyle");

    return 0;
}
