package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        // Arrayleri kisa yoldan nasil olusturabiliriz.
        // int arr [] = {array'ler}

        int arr [] = {63, 2, 313, 8, 7, 100, 4};
        System.out.println(Arrays.toString(arr));// [63, 19, 313, 353, 7, 100, 4]

        //Ornek-1: Verilen array de kac cift-tek sayi oldugunuz yazdiriniz.

        int sayac = 0;
        for ( int w : arr   ) {
            if (w%2==0){
                sayac++;
            }

        }
        System.out.println("Array'deki " +sayac+ " adet cift sayi "+ (arr.length-sayac)+" adet tek sayi vardir.");

        // arr.length-sayac==> amaci sayac ile ciftleri aldik toplamdan bulunan ciftlerin sayisini cikararak
        // tek sayilari bulmus olduk.

        //Ornek-2: Size verilen bir String arraydeki isimlerden 5 character icerenleri console'a yazdiriniz.
        String stdName[] = {"Benna", "Irem", "Ajda", "Filiz", "Tom"};

        for (String w: stdName) {
            if (w.length()<5){
                System.out.println("Ornek-2: "+w);
            }
        }

        //Ornek-3: Size verilen bir string arraydeki isimleri alfabetik siraya koyduktan sonra
        //"F" ile baslayan isimler haric diger isimleri console yazdiriniz.

        /* Not-1: sort() metotu sayisal data type'lari ile kullanildiginda kucukten buyuge siralar(ascending order)
           Not-2: sort() metotu string data type lari alfabetik olarak siralar (alphabetical order)
           Not-3: ascendig order + alphabetical order ==> natural order
           Not-4: sort() metotu array elemanlarini natural order a gore siralar
        */
        Arrays.sort(stdName);
        System.out.println(Arrays.toString(stdName));

        for (String w : stdName ) {
            if (w.startsWith("F")){
                continue;
            }
            System.out.print(w+" ");
        }






















    }
}
