let ad = "Sadık";
let soyad = "Turan";
let yas ="39";
let sehir = "Kocaeli";

// let mesaj = "Benim adım "+ ad +" ve  soyadım "+soyad+'. '+sehir+"'de yaşıyorum  " + ' Emekliliğe '+ (65-yas) + ' yılım kaldı.';



let emeklilik = ( 65 - yas > 0) ? "Emekliliğe "+ (65-yas) + " yıl kaldı" : "zaten emekli oldunuz";
mesaj = `Benim adım ${ad}  ve  soyadım ${soyad}. ${sehir}'de yaşıyorum    ${(emeklilik)}` ;

console.log(mesaj);