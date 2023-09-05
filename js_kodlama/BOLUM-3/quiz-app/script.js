//OOP: Nesne tabalı programlama
//Object



let soru={
    soruMetni:"Hangisi javascript paket yönetim uygulamasıdır?",
    cevapSecenekleri:{
        a:"Node.js",
        b:"Typescript",
        c:"Npm",

    },
    dogruCevap:"c",
    cevabiKontrolEt:function(cevap)
    {
        return cevap == this.dogruCevap
    }
}


// let soru2 = {
//     soruMetni:"Hangisi .net paket yönetim uygulamasıdır?",
//     cevapSecenekleri:{
//         a:"Node.js",
//         b:"Nuget",
//         c:"Npm",

//     },
//     dogruCevap:"b",
//     cevabiKontrolEt:function(cevap)
//     {
//         return cevap == this.dogruCevap
//     }
// }

//Sınıf => nesne*30
//ES5,ES6,ES7

0
function Soru(soruMetni,cevapSecenekleri,dogruCevap)
{
    this.soruMetni = soruMetni;
    this.cevabSecenekleri = cevapSecenekleri;
    this.dogruCevap = dogruCevap;
}

let soru1 =  new Soru("Hangisi javascript paket yönetim uygulamasıdır?",{a:"Node.js",b:"Typescript",c:"Npm"},"c");
let soru2 =  new Soru("Hangisi .net paket yönetim uygulamasıdır?",{a:"Node.js",b:"nuget",c:"Npm"},"b");

[
    new  Soru =  new Soru("Hangisi javascript paket yönetim uygulamasıdır?",{a:"Node.js",b:"Typescript",c:"Npm"}),
    new  Soru =  new Soru("Hangisi javascript paket yönetim uygulamasıdır?",{a:"Node.js",b:"Typescript",c:"Npm"}),
    new  Soru =  new Soru("Hangisi javascript paket yönetim uygulamasıdır?",{a:"Node.js",b:"Typescript",c:"Npm"}),
    new  Soru =  new Soru("Hangisi javascript paket yönetim uygulamasıdır?",{a:"Node.js",b:"Typescript",c:"Npm"})
]    

console.log(sorular[0].soruMetni);

for(let s of sorular)
{
    console.log(s.soruMetni);
}

console.log(soru1.soruMetni);
console.log(soru1.dogruCevap);

console.log(soru2.soruMetni);
console.log(soru2.dogruCevap);