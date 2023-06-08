package day05concatinationoperatortypecasting;

public class Day05Tekrar {
    public static void main(String[] args) {
    /*
    ASCII degeri sayi, harf ve sembollerin sayisal degerlerine verilen isimdir.
    Herhangi bir character'in ASCII degerini bulmak icin o karekteri "int" data type' inda bir variable' in icine koyunuz.
    Java'da char'lari matematiksel islemlerde kullanirsaniz, Java o char'larin ASCII degerlerini kullanir.      */

        /* Java'da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur.
         * Java'da "+" sembolu iki string arasinda veya bir string ve bir sayi arasinda kullanillirsa
           concatenation islemi olur.
        * * * *Not: Concatenation islemlerinde java matematikte ki islem onceligi kurallarini kullanir.       */

        /*Not-1: valueOf() methodu tum karakterleri rakam olan Stringleri sayilara cevirir.
          Not-2: Eger valueOf() methodu kullanilirken String in icine rakam olmayan bir karakter koyarasaniz hata alirisiniz.
                 valueOf() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir.
        */

        String araba    = "5000";   //String araba = "500$" veya "500 " veya "500 TL" yazilirsa hata verir.
        String bisiklet = "2000";

        int fiyat = Integer.valueOf(araba)+Integer.valueOf(bisiklet);
        System.out.println(fiyat);

        /*
        Numeric primitive data type'larinin birbirine donusturulmesine "Type Casting" denilir.
        Numeric (Sayisal) primitive Data Type'lar : byte-short-int-long-float-double

        Not-1: Kucuk data type'larini buyuk data typeælarina cevirmeyi java otomatik olarak yapabilir.
               Bu isleme "AutoWidening" (Otomatik Genisletme) denir.

        Not-2:Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir, java bu riskli isi otomatik yapmaz,
              bu islemi kod yazan yapar.
              Bu isleme "ExplicitNarrowing" (Aciktan daraltma) denir.
    */

    }
}
