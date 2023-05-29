package day05concatinationoperatortypecasting;

public class Operators {
    /*
        1) Dort islemler matematik oldugu gibi Java'da da kullanilir.
           a- int/int==> int olur
           b- doluble+int==>double olur.
        Cunku javada matematiksel islemlerde farkli data type'lari kullanilirsa sonuc her zaman buyuk data type gore yapilir.

        2) Java' da "Logical Operator" ler vardir. AND ve OR islemleri "Logical Operator"lerdir.
           1.a- AND (&&) isleminden true alabilmek icin hersey true olmalidir.
           1.b- AND islemi "perfectionist"tir.
           1.c- AND islmeinde bir tane bile false sonucu false yapar.

           2.a- OR (||) isleminde bir tane true sonucu true yapmaya yeterlidir.
           2.b- OR isleminde false olmasi icin hersey false olmalidir.
           2.c- OR islemi "polyanna" gibidir.

           3.a NOT (!) true olani false, false olani true yapar. !true == false, !false == true, !!true == true

        3) Comparison (Karsilastirma) Operators
           <, >, <=, >=, ==, !=
        * * * NOT-1: KARSILASTIRMA OPERATORLERINI KULLANDIGINIZDA 'KESINLIKLE' boolean (true veya false) alirsiniz.* * *
        * * * NOT-2: (AND) islemi icin && kullaniriz & kuillanimida vardir. Farklari nedir?
              "&&" kullanimda ilk ifade false oldugunda digerlerini kontrol etmez dolayisiyla
         hizli calisir. Cunku && isleminde ilk ifade false ise digerlerinin bir onemi yoktur sonuc false'dir.
         "&" kullaniminda ilk ifade ne olursa olsun digerlerini kontrol eder dolayisi ile yavas calisir.
         Biz bu yuzden hep cift and "&&" kullaniriz.
    */
    public static void main(String[] args) {

        boolean first = 3<5;
        boolean second = 2+3!=5;
        boolean third = 2+3*5>19;
        System.out.println("Sirasiyla degerler: " + first + "-" + second + "-" + third); //true-false-false

        System.out.println(first && second);//false
        System.out.println(first || second || third);//true






































    }//main
}//class
