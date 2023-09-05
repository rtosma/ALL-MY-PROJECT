let ogrenciler =["çınar","yiğit","ada"];


sonuc = ogrenciler.length;

// array to string
sonuc=ogrenciler.toString();
sonuc=ogrenciler.join("-");


//eleman silme

//sonuc = ogrenciler.pop(); //son elemen silinir ve silinen eleman geri döndürülür
//sonuc = ogrenciler.shift(); //ilk eleman silinir

//eleman ekleme
// sonuc=ogrenciler.push("sena"); // dizinin sonuna eleman ekler
// sonuc=ogrenciler.unshift("sena"); // dizinin başına eleman ekler

let markalar1 = ["mazda","toyota"];
let markalar2 = ["opel","volvo"];
let markalar3 = ["mercedes"];

// sonuc = markalar1.concat(markalar2,markalar3); // concat dizileri birleştirir
//  sonuc = markalar1.splice(0,1,"bmw","audi");
sonuc = markalar1.splice(0,1)

console.log(sonuc);
console.log(markalar1);