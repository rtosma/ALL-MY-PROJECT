let simdi = new Date(); //şimdiki tarih-saat


//Get methots
sonuc = simdi;
sonuc = simdi.getDate();
sonuc = simdi.getDay();//0:pazar 1:pazartesi 2:salı 3:çarşamba
simdi = simdi.getFullYear();//yıl
simdi = simdi.getHours();//saat
simdi = simdi.getTime();


//set methods
//simdi.setFullYear(2025);
simdi.setMonth(7);//0:ocak ayına denk gelir
simdi.setDate(15);

sonuc=simdi;

let dogumTarihi = new Date(2002, 12, 04);

sonuc = simdi.getFullYear() - dogumTarihi.getFullYear();


let milisecond = simdi-dogumTarihi;
let saniye = milisecond/1000;
let dakika = saniye/60;
let saat = dakika/60;
let gun = saat/24;

sonuc = gun;

console.log(sonuc);
console.log(typeof sonuc);

