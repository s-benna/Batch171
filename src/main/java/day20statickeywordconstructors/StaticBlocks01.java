package day20statickeywordconstructors;

public class StaticBlocks01 {



    // Bir variable olusturdugunuzda, deger atamazsaniz o variable'i "initialize" etmediniz demektir.
    static double pi;
    static String shape;


    static {
        pi = 3.14;
        System.out.println("static block 1");
    }
    // Static bloklar, static variable'lari initialize etmek icin kullanirlar
    // ve class icinde herseyden once calistirilirlar
    // birden fazla static block oldugunda static blocklar yukaridan asagiya sirasiyla calisir

    static {
        shape = "circle";
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
    /*
    Bazen main method'dan calistirilmadan once variable'larin hazir hale getirilmesi gerekir.
    Bu nedenle static blocks ihtiyac duyabiliriz.

    Static variable static bloklar icinde initialize edilirse o class in icinde herseyden once hazir hale getirilmesi
    gerekiyor.
    */
        System.out.println(pi);
        System.out.println("main method");


    }


}
