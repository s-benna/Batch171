package day07StringManipulations;

public class StringManipulations01 {

    public static void main(String[] args) {
        String t = "Ali 13 yasindadir!...";
        //Ornek-7: "t" String'de ki tum rakamlari "*" ceviriniz.
        String s7 = t.replaceAll("[0-9]", "*");
        System.out.println("Ornek-7: " + s7);//Ornek-7: Ali ** yasindadir!...

        String s8 =t.replaceAll("[i]","*");
        System.out.println("Ornek-1: " + s8);//Ornek-1: Al* 13 yas*ndad*r!...

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
            8- Tum x, q, w harflari [xqw]
               * * OLUMSUZLAR * *
            9-  Kucuk harflerden farkli tum characterler [^a-z]
            10- Tum harflerden farkli tum characterler [^a-zA-Z]
            11- Sadece space karekteri ==> \\s
                space kaakteri haric ==> \\S
                sadece rakamlar ==> \\d (d==digit)
                rakamlar haric ==> \\D
                * * * Buyuk harf ile yazildiginda olumsuzunu ifade etmis oluyoruz.
        */

            //Ornek-2: "t" String'inde ki tum rakamlari ve harfleri "!" ceviriniz.
            String s9 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println("Ornek-2: " + s9);//Ornek-2: !!! !! !!!!!!!!!!!...

            String s10 = t.replaceAll("[\\s]","!");
        System.out.println("Ornek-2.1: " + s10);//Ornek-2.1: Ali!13!yasindadir!...

            //Ornek-3: "t" String'inde ki tum sesli harfleri "?" ceviriniz.
            String s11=t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println("Ornek-3: " + s11);//Ornek-3: ?l? 13 y?s?nd?d?r!...

            //Ornek-4: "t" String'inde ki kucuk harfler disinda ki tum characterleri "<>" ceviriniz.
            String s12 =t.replaceAll("[^a-z]","<>");
        System.out.println("Ornek-4: " + s12);//Ornek-4: <>li<><><><>yasindadir<><><><>

        //Ornek-5: "t" String'inde ki tum harfler disinda ki tum characterleri "+" ceviriniz.
            String s13 =t.replaceAll("[^a-zA-Z]","+");
        System.out.println("Ornek-5: " + s13);//Ornek-5: Ali++++yasindadir++++

        //Ornek-6: "t" String'inde ki space'ler disinda ki tum characterleri "?" ceviriniz.
            String s14=t.replaceAll("[\\S]","?");
        System.out.println("Ornek-6: " + s14);//Ornek-6: ??? ?? ??????????????

        //Ornek-7: "t" String'inde ki sesli harfler disinda ki tum characterleri "&" ceviriniz.
            String s15=t.replaceAll("[^aeuioAEUIO]","&");
        System.out.println("Ornek-7: " + s15);//Ornek-7: A&i&&&&&a&i&&a&i&&&&&






    }//main
}//class