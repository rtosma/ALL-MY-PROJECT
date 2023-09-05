 #include <stdio.h>
 #include <iostream> 
 #include <string> 
 #include <stdlib.h> 
 #include <time.h> 
int main() 
 { 
 	char corba;
 	char anayemek;
 	int sec;
 	char bul;
 	srand(time(NULL));
 	
 	printf("Bugun ne yapsam");
 	printf("1-Corba 2-Anayemek");
 	scanf("Bir rakam seciniz %d",&sec);
 	
 	switch(sec)
 	{
 		case 1:
 			char corbalar[4] = {("tarhana"),("ayranlýcorba"),("kýrmýzýmercimek"),("siyahmercimek"),("sehriyecorbasý")}; 
         	char bul = rand()%5; 
 	        cout << mevsimler[bul]; 
 	        break;
 			
 	 	
	}
 	
 	
 	
 }
