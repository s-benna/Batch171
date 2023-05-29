package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //  String bir non-primitive data type'dir ve ayni zamanda bir class'dir.

        String s = "Java is easy";
        //Ornek-1: "s" String inde ki tum characteræleri buyuk yapiniz.
        String sUpper = s.toUpperCase();
        System.out.println("Ornek-1: " + sUpper);//JAVA İS EASY

        //Ornek-2: "s" String'inde ki tum character'leri kucuk harflerle yazdiriniz.
        String s1 = "Java Is EASY";
        String sLow = s1.toLowerCase();
        System.out.println("Ornek-2: " + sLow);

        //Ornek-3: "s" String'de ki ilk character'i aliniz.
        String s2 = "Java is easy";
        char ilkHarf = s2.charAt(0);
        System.out.println("Ornek-3: " + ilkHarf);

        //Ornek-4: "s" String'inde ki 2. ve sondan ikinci characterleri aliniz ve ekrana yazdiriniz.
        char secondChar = s.charAt(1);
        System.out.println("Ornek-4.1: " + secondChar);
        char lastTwoChar = s.charAt(10);
        System.out.println("Ornek-4.2: " + lastTwoChar);
        System.out.println(""+secondChar+lastTwoChar);//as
        System.out.println(secondChar+lastTwoChar);//212-ASCII degerini verir.

        //Ornek-5: "s" karekterinde kullanilan toplam karekteri hesaplatiniz.
        int sLength=s.length();
        System.out.println("Ornek-5: " + sLength);//12

        //Ornek-6: "s" Stringde ki ilk dort characteri aliniz.
        //substring(0,4) ==> ilk index dahil, ikinci index haricdir
        String sub1 = s.substring(0,4);
        System.out.println("Ornek-6: " + sub1);

        //Ornek-7: "s" Stringde ki is kelimesini aliniz.

        String sub2 =s.substring(5,7);
        System.out.println("Ornek-7: " + sub2);

        //Ornek-8: "s" String'de ki easy kelimesini alin.
        //Bir character'den baslayip String'in sonuna kadar almak isterseniz, ikinci character yazmaya gerek yoktur.
        String sub3 =s.substring(8);
        System.out.println("Ornek-8: " + sub3);

        //Ornek-9: "s" String'de ki "money" kelimesinin var olup olmadigini kontrol ediniz.
        boolean isExist=s.contains("money");
        System.out.println("Ornek-9: " + isExist);//false
        boolean isExist1=s.contains("java");
        System.out.println("Ornek-9.1: " + isExist1);//true
        boolean isExist2=s.contains("");
        System.out.println("Ornek-9.2: " + isExist2);//true- hiclik heryerdedir.

        //Ornek-10: "s" String'inin bellie bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println("Ornek-10: " + isStart);//true

        //Ornek-11: "s" String'nin 6. characterden itibaren belli bir harfle baslayip basladigini kontrol ediniz.
        boolean isBegin = s.startsWith("i", 5);
        System.out.println("Ornek-11: " + isBegin);//true


    }//main
}//class
