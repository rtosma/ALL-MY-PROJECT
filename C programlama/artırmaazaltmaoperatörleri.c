#include <stdio.h>
#include <locale.h>


int main(){
	char *locale;
     locale = setlocale(LC_ALL, "");
     
     int a=10,b=100;
     float c=18.4,d=115.6;
     
     printf("++a %d\n",a);
     printf("--b %d\n",b);
     printf("++c %f\n",c);
     printf("--d %f\n",d);
     
      int e=41,f=68;
     float g=25.8,h=84.5;
     
     printf("++e %d\n",e);
     printf("--f %d\n",f);
     printf("++g %f\n",g);
     printf("--h %f\n",h);
     
      int i=26,j=125;
     float k=15.8,l=145.7;
     
     printf("++i %d\n",i);
     printf("--j %d\n",j);
     printf("++k %f\n",k);
     printf("--l %f\n",l);
     
      int m=58,n=74;
     float o=47.7,p=654.5;
     
     printf("++m %d\n",m);
     printf("--n %d\n",n);
     printf("++o %f\n",o);
     printf("--p %f\n",p);
     
     return 0;
     
}
