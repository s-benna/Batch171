package day05concatinationoperatortypecasting;

public class Concatination {
    public static void main(String[] args) {

        //Ornek 1: Bir string ve iki int variable olusturun. String degeri ile int'lerin toplamini yazdiriniz.
        String s ="elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b);//elma1011; deger string ile basladigi icin string devam etti. Buna "Concatination" denir.
        System.out.println(s+(a+b));//elma21; ic parantez toplama yapti devaminda String data oldugu icin String islemine devam etti.
        System.out.println(s+a*b);//elma110; islem onceligi carpida oldugu icin once carpma sonra toplama yapti.
        System.out.println(a+b+s);//21elma; sirasi ile islem yapmaya devam etti.
        System.out.println(a+s+b);//10elma11; sirasi ile islem yapmaya devam etti.

        // * Java'da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur.
        // * Java'da "+" sembolu iki string arasinda veya bir string ve bir sayi arasinda kullanillirsa
        //concatenation islemi olur.
        //* * * *Not: Concatenation islemlerinde java matematikte ki islem onceligi kurallarini kullanir.

        /*
        1- Once uslu sayilar
        2- Parantez ici islemler yapilir.
        3- Carpma ve bolme islemi
        4- Toplama ve cikarma islemi
        5- Ayni oncelikli olanlarda soldan saga baslanir
        */

        //Ornek 2: Size string olarak verilen iki fiyat toplamini ekrana yazdiriniz.
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);//23005200

        //Integer.valueOf() string degerleri integer' a cevirir.
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println("Fiyat toplami: " + toplamFiyat);//7500

        //Ornek 3: Size verilen string data'yi toplayip ekran yazdirin.
        String tv = "10000";
        String radio = "7000";
        int ornek3 = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println("Beyaz Esya: " + ornek3);

        /*Not-1: valueOf() methodu tum karakterleri rakam olan Stringleri sayilara cevirir.
          Not-2: Eger valueOf() methodu kullanilirken String in icine rakam olmayan bir karakter koyarasaniz hata alirisiniz.
                 valueOf() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir.
        */




















    }//main
}//class
