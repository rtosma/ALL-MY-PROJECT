// let sayi1=90;

// if(sayi1>=10 && sayi1<=50)
//  {
//     console.log("sayi 10 ile 50 arasındadır");
//  }
//  else
//  {
//     console.log("sayi 10 ile 50 arasında değildir");
//  }
// -----------------------------------------------------------
// let sayi = 8;

// if(sayi%2==1 || sayi>0)
// {
//     console.log("Sayi tek sayidir");
// }
// else
// {
//     console.log("Sayi tek değildir");
// }
//--------------------------------------------------------------------
// let x=10,y=20,z=30;

// if(x>y && x>z)  
// {
//     console.log("x en büyük");
// }
// else if(y>x && y>z)
// {
//     console.log("y en büyük");
// }
// else if(z>x && z>y)
// {
//     console.log("z en büyük");
// }
// else
// {console.log("sayılar eşittir");}
//-------------------------------------------------------------------

let vize1 = 50;
let vize2 = 49;
let final = 50;

let ortalama = ((vize1 + vize2) /2 * 0.4) + (final * 0.6);
console.log("ortalamanız: "+ortalama);
if(ortalama>=50&&final>=50)
{
    console.log("Geçtiniz");
}
else if(ortalama<50 && final>=70)
{
    "Geçtiniz"
}
else{
    console.log("Kaldınız");
}
