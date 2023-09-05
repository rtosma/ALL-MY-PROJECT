#include <stdio.h>
#include <locale.h>



int main(){
	
	char *locale;
     locale = setlocale(LC_ALL, "");
	
	
	int r;
	double A;
	double V;
	
	printf("Yarýçap deðeri giriniz:");
	scanf("%d",&r);
	
	A=4*3.14*r*r;
	V=4*3.14*r*r*r;
	printf("\n Kurenin yuzey alani: %lf",A);
	printf("\n Kurenin hacmi:%lf",V);
	
	return 0;
}
