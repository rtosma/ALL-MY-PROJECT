let ogr1_ad="Ada";
let ogr1_Soyad="Bilgi";
let ogr1_dogumtrh="2012"
let ogr1_mat1=70;
let ogr1_mat2=70;
let ogr1_mat3=80;
let ogr1_ortalama = (ogr1_mat1+ogr1_mat2+ogr1_mat3)/3;
console.log(parseFloat(ogr1_ortalama));
console.log(ogr1_ortalama>=50);



let ogr2_ad="Yiğit";
let ogr2_Soyad="Bilgi";
let ogr2_dogumtrh="2010";
let ogr2_mat1=40;
let ogr2_mat2=40;
let ogr2_mat3=50;
let ogr2_ortalama = (ogr2_mat1+ogr2_mat2+ogr2_mat3)/3;
console.log(parseFloat(ogr2_ortalama));
console.log(ogr2_ortalama>=50);


let sunakiyil = new Date().getFullYear();

let ogr1_yas = sunakiyil - parseInt(ogr1_dogumtrh);
console.log(ogr1_yas);
let ogr2_yas = sunakiyil - parseInt(ogr2_dogumtrh);
console.log(ogr2_yas);
