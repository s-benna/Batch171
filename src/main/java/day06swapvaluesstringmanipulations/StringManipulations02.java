package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s ="Learn Java earn money";

        //Ornek-1: "s" String'nin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd= s.endsWith("money");
        System.out.println("Ornek-1: " + isEnd);//true

        //Ornek-2: "s" String'nin "money" kelimesini dollar kelimesine ceviriniz.
        String s1=s.replace("money","dollar");
        System.out.println("Ornek-2: " + s1);//Learn Java earn dollar

        //Ornek-3: "s" String indeki "earn" kelimesinin "win" kelimesine ceviriniz.
        String s2 = s.replace("earn", "win");
        System.out.println("Ornek-3: " + s2);//Lwin Java win money

        //Ornek-4: "s" String indeki "a" harflerini "*" ceviriniz.
        String s3 =s.replace("a", "*");
        System.out.println("Ornek-4: " + s3);//Le*rn J*v* e*rn money

        String s4=s.replace( 'a', '*');
        System.out.println("Ornek-4.1: " + s4);

        /* NOT: replace () methodunda coklu character'ler icin calisirsaniz mecburen cift tirnak kullanmaliyiz.
        Ama tek character ile calisirsaniz cift tirnak veya tek tirnak kullanilabilir.
        Ya ikisi de cift tirnak olmalidir ya da ikisi de tek tirnak olmalidir.
        */

        //Ornek-5: "s" Stringe ki "n" harfini "XXX" ile degisiniz.
        String s5=s.replace("n", "XXX");
        System.out.println("Ornek-5: " + s5);

        //Orenk-6: "s" Stringe ki "e" harfini siliniz.
        String s6=s.replace("e", "");
        System.out.println("Orenk-6: " + s6);


        //Not: Bir grup datayi ifade etmek icin "Regular Expressions" (Regex) kullanilir.
        String t = "Ali 13 yasindadir!...";
        //Ornek-7: "t" String'de ki tum rakamlari "*" ceviriniz.
        String s7 = t.replaceAll("[0-9]", "*");
        System.out.println("Ornek-7: " + s7);

        /*  Not-1: Bir grup datayi degistirmek icin ***replace*** Java'da onemli bir method'dur.
            Not-2: Regex'ler de "^" haric demektir.
                    Meshur Regex'ler
            1- Tum rakamlar [0-9]
            2- Tum kucuk harfkar [a-z]
            3- Tum buyuk harfler [A-Z]
            4- Tum kucuk ve buyuk harfler [a-zA-Z]
            5- Tum harfler ve rakamlar [A-Za-z0-9]
            6- Tum noktalama isaretleri \\p{Punct}
            7- Tum sesli Harfler [aeiouAEIOU]
               * * OLUMSUZLAR * *
            8- Kucuk harflerden farkli tum characterler [^a-z]
            9- Tum harflerden farkli tum characterler [^a-zA-Z]
        */























    }//main
}//class













