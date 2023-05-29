package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        // Ornek: Verilen bir String'de kucuk harfleri console'a yazmayiniz.
        // "Pwd12?Ab" ==> P12?A

    String s = "Pwd12?Ab";

    for ( int i=0 ; i<s.length();i++){
        char ch = s.charAt(i);
        if (ch>='a' && ch <= 'z')//kucuk olma sartimiz
          {continue; }
        else {
            System.out.print(ch);
        }
    }
        //Note : Break ile continue arasindaki fark nedir?
        // "break" ile loop parantezinin disina cikmak icin ve loop u kirmak icin kullanilir.
        // continue ise loop yaparken bazi istenen elemanlari isleme sokmak icin kullanilir
        // continue keywordu bir looptaki gecerli iteration i sonlandirip sizi incremen/decrement parta getirir.



    }
}
