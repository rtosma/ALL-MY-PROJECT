 let url = "https://www.sadikturan.com";

 let kursAdi1 = "Komple Web Geliştirme Eğitimi";

// console.log(url.length);

//Kurs Adı Kaç kelimeden oluşmaktadır.
/*
sonuc=kursAdi1.split(" ").length;
console.log(sonuc);*/
//---------------------------------------------
//url https ile mi başlıyor
/*sonuc=url.startsWith("https");
if(sonuc){ 

    console.log("evet başlıyor");
}*/
//----------------------------------------------
//Kurs adı içerisinde eğitimi kelimesi var mı
/*if(kursAdi1.indexOf("Eğitimi")>-1)
{
    console.log("evet var")
}else
{
    console.log("hayır yok")
}*/

//-----------------------------------------------
//url ve kursAdi değişkenlerinş kullanarak aşağıdaki string bilgiyi oluşturunuz

//https://www.sadikturan.com/komple-web-gelistirme-kursu

kursAdi1=kursAdi1.toLowerCase();
kursAdi1=kursAdi1.replaceAll(" ","-");
kursAdi1=kursAdi1.replace("ş","s").replace("ı","i");
sonuc = `${url}/${kursAdi1}`;
console.log(sonuc);
