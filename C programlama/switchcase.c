#include <stdio.h>

int main(){
	
	int tercih;
	
	
	printf("Hangi yazilim dilini kullanmak istiyorsunuz:?\n");
	printf("1-C dili, 2-Java dili,3- C++ dili,4-Python dili\n");
	printf("Tercih ettiginiz yazilim dilinin numarasini tuslayiniz:");
	scanf("%d",&tercih);
	
	
	switch(tercih){
		case 1: printf("Dev C++ Compiler'ini indirmeniz gerekmektedir."); break;
		case 2: printf("NetBeans Compiler'ini indirmeniz gerekmektedir.");break;
	    case 3: printf("VisualStudio Compiler'ini indirmeniz gerekmektedir.");break;
	    case 4: printf("Anaconda Compiler'ini indirmeniz gerekmektedir.");break;
		
	}
	
	
	
	
	return 0;
}
