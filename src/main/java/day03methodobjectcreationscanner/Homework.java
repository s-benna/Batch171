package day03methodobjectcreationscanner;
/*
    Homework-1
        1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        2)Dairenin alinini hesaplayan methodu olusturunuz ve kullaniniz
        Cemberin cevresinin formulu==> 2*r*Pi(3.14)--- Alan formulu==> r*r*Pi(3.14)
    Homework-2
        1)Icinde isim ve yas variable'lari ile teach methoduda bulunan bir teacher
        objesi olusturun ve ve obje uzerinde bu ozellikleri kullanin
     */

public class Homework {
    public static void main(String[] args) {
        double r=6;
        daireCevresi((int) r);

        double r1=4;
        daireninAlani (r1);

    }//main

    private static void daireninAlani(double r1) {System.out.println("Dairenin alani: " + r1*r1*3.14);}
    private static void daireCevresi(int r) {System.out.println("Cemberin cevresi: " +2*r*3.14);}


}//class
