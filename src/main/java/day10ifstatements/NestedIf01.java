package day10ifstatements;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*  Example 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise "eskenar" Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */

        Scanner ucgen = new Scanner(System.in);
        System.out.println("Lutfen 3 sayi girniz...");

        double a = Math.abs(ucgen.nextDouble());
        double b = Math.abs(ucgen.nextDouble());
        double c = Math.abs(ucgen.nextDouble());


        boolean ucgenmi = (a+b>c && c>Math.abs(a-b))&& // a+b>c>|a-b|
                          (a+c>b && b>Math.abs(a-c))&& // a+c>b>|a-c|
                          (b+c>a && a>Math.abs(b-c));  // b+c>a>|b-c|)

        if (ucgenmi) {

            if (a == b && b == c && a == c) {
                System.out.println("Ucgendir hemde eskanar ucgendir ");
            } else {
                System.out.println("Ucgendir ama eskanar degil.. ");
            }

        } else {
            System.out.println("Bu bir ucgen degildir");
        }






    }
}
