#include <stdio.h>
#include <windows.h>

int main(){
	system("COLOR E");
	
	//gerilim=akim*direnç
	//guc = akim*gerilim=akim*2*dirneç=gerilim^2/direnc
	
	int gerilim,akim,direnc,guc;
	
	printf("Lutfen gerilim degerini yaziniz:");
	scanf("%d",&gerilim);
	
	printf("Lutfen direnc degerini giriniz:");
	scanf("%d",&direnc);
	
	akim=gerilim/direnc;
	guc = akim*gerilim;
	
	printf("Devrenizin Akimi = %d\n",akim);
	printf("Devrenizin Gucu = %d\n",&guc);

	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
	
}
