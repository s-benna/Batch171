package day05concatinationoperatortypecasting;

public class TypeCasting {
    /*
        Numeric primitive data type'larinin birbirine donusturulmesine "Type Casting" denilir.
        Numeric (Sayisal) primitive Data Type'lar : byte-short-int-long-float-double

        Not-1: Kucuk data type'larini buyuk data typeælarina cevirmeyi java otomatik olarak yapabilir.
               Bu isleme "AutoWidening" (Otomatik Genisletme) denir.

        Not-2:Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir, java bu riskli isi otomatik yapmaz,
              bu islemi kod yazan yapar.
              Bu isleme "ExplicitNarrowing" (Aciktan daraltma) denir.
    */

    public static void main(String[] args) {

        //byte data type'ini int data type'ina ceviriniz.
        byte age = 13;
        int ageInt = age;//AutoWidening

        //int data type'ini short data type'ina ceviriniz.
        int weight =313;
        short weightShort= (short)weight;//Explicit Narrowing

        //int data type'ini float data type'ina ceviriniz.
        int population =77000;
        System.out.println(population);//77000
        float populationFloat=population;
        System.out.println(populationFloat);//77000.0

        //double data type'ini short data type'ina ceviriniz.
        double number=12.99;
        System.out.println(number);//12.99
        short numberShort = (short)number;
        System.out.println(numberShort);//12

        short num =260;
        System.out.println(num);//260
        byte numByte = (byte) num;
        System.out.println(numByte);//4

        /* * * *NOT Donusum yaptiginiz sayi(260), donuseceginiz data type inin sinirlarini disinda ise

        java kullandiginiz sayi ile "mod" islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur. */














    }

}
