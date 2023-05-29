package day15loops;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
       /*  Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
              3 ==> 3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 ...
                    3x10=30                 */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sayi giriniz..");
        int alinansayi = input.nextInt();

        int a = 1;
        while (a<11){
            System.out.println(alinansayi +"x"+ a+ "="+ alinansayi*a + " ");
            a++;
        }
        System.out.println();

        //Example 2: Verilen bir string de her harfin sonrasina "*" sembolu ekleyiniz.

        System.out.println("Kelimenizi giriniz..");
        String verb = input.next();
        String newverb="";

        int b =0;

        while (b<verb.length()){
            newverb = newverb + verb.charAt(b)+"*";

            b++;
        }   System.out.println("Ex-2: "+newverb);


        //Example 3: Bir Stringdeki tekrarsiz karakterleri yazdiriniz.
        // kertenkelle ==> rtn

        // indexOf("k") ==> 0  farkli, tekrarli
        // lastIndexOf("k") ==> 6

        // indexOf("r") ==> 2  ayni ise tekrarsiz
        // lastIndexOf("r") ==> 2
        String s = "kertenkelle";
        String sonuc = "";
        int c = 0;
        while (c<s.length()){
        char ch = s.charAt(c);
        if (s.indexOf(ch)==s.lastIndexOf(ch)){
            sonuc = sonuc +ch;
        }

            c++;
        }
        System.out.println("Ex-3: "+sonuc);

















    }
}
