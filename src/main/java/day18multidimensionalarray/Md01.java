package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        /*  Bir Array'in elemanlari Array ise bu Array'ler Multidimensional Array'dir.
            Multidimensional Array nasil olusturulur.
        */

        int a [][] = new int[3][2];


        // Mutlidimensional Array'lere eleman ekleme
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[2][1]=0;
        a[1][0]=90;

        // Mutlidimensional Array nasil yazdirilir?
        System.out.println(Arrays.toString(a));     // [[I@4fca772d, [I@9807454, [I@3d494fbf]
        System.out.println(Arrays.deepToString(a)); // [[5, 12], [0, 45], [123, 0]]

        // Mutlidimensional Array'de spesific bir eleman nasil yazdirilir?
        System.out.println(a[0][1]);//12
        System.out.println(a[2][1]);//0
        System.out.println(a[0]);   //[I@4fca772d
        System.out.println(Arrays.toString(a[1]));//[90, 45]

        //Kisa yoldan Multidimensional array nasil olsuturulur?

        String students [][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        // Ornek-1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int sum =0;
        for ( String []  w : students ) {
            sum = sum+w.length;
        }
        System.out.println("Ornek-1: "+sum);
















    }
}
