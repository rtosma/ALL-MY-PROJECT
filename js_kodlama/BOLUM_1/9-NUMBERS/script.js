let sonuc;

sonuc = 10;
sonuc = "10";
sonuc = Number("10");
sonuc = parseInt("10.5");
sonuc = parseFloat("10.5");
sonuc = parseInt("a10");

sonuc = isNaN("10a");

let sayi = 15.1242665;
// toPrecision tüm sayı üzerinden girdiğimiz sayı kadar basamak gösterir.
sonuc=sayi.toPrecision(5);
// toFixed tüm sayı üzerinden girdiğimiz sayı kadar ondalıklı basamağı gösterir.
sonuc=sayi.toFixed(5);
//en yakın sayıya yuvarlar
sonuc=Math.round(2.6);
//en yakın üst sayıya yuvarlar
sonuc=Math.ceil(2.2);
//en yakın alt sayıya yuvarlar
sonuc=Math.floor(2.6);
//karekök alma
sonuc=Math.sqrt(25);
//üs alma
sonuc=Math.pow(2,3);
//mutlak değer
sonuc=Math.abs(-10);
//sayılar arasından en küçüğü bulma
sonuc=Math.min(4,1,4,61,6,8);
//random sayı üretme
sonuc=Math.floor(Math.random()*100)+150;


console.log(typeof sonuc);
console.log( sonuc);