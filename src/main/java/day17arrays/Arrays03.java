package day17arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Spesifik bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz

        String names [] = {"K", "C", "R", "A", "S"};
        String el = "R";

        //1.yol
        int counter=0;
        for (String w :names) {
            if (w.equals(el)){
               counter++;
               break;
            }
        }
        if (counter>0){
            System.out.println("Array has " +el);
        }else {
            System.out.println("Array does not have " +el);
        }

        //2.Yol==> binarySearch() metotu
        /*  1- binarySearch() metotu sort() metotu olmadan kullanmayiniz, cunku binarySearch() mantigi sirali elemanlari
        icin gecerlidir. sort() yapmak pre conditiondir binarySearch kullanmak icin.
            2- binarySearch() metotu var olan elemanlar icin bize o elemanin index'ini verir.
               binarySearch() metotundan aldiginiz index 0 veya 0'dan buyuk ise bu o eleman arrayde var demektir.
            3- binarySearch() metotu olmayan elemanlar icin negatif tamsayi degeri verir.
               "-" isaretinin anlami o eleman yok demektir.
               "sayi" ise o eleman kacinci eleman olurdu demektir.          */

         Arrays.sort(names);
         int result = Arrays.binarySearch(names,el);
        System.out.println(Arrays.toString(names));
        System.out.println(result);

        if (result<0){
             System.out.println("Array has " +el);
         }else {
             System.out.println("Array does not have " +el);
         }

        int num1 = Arrays.binarySearch(names,"A");
        System.out.println(num1);

        int num2 = Arrays.binarySearch(names,"K");
        System.out.println(num2);

        int num3 = Arrays.binarySearch(names,"U");
        System.out.println(num3);































    }
}
