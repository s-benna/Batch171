package day03methodobjectcreationscanner;

public class Day03Tekrar {

    public static void main(String[] args) {

        String str1 = "Java er lett.";
        print(str1);

        //Ornek 3: Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz.
        int a = 23;
        int b = 12;
        carpmaYap(a,b);

    }//main

    public static void print(String str1) {
        System.out.println(str1);
    }
    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }


}//class
