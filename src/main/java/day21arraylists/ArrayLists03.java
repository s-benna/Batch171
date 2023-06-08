package day21arraylists;

import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {

        // Kisa yoldan bir List nasil olusturulur?
        // List.of() methodu ile degistirlemez List olusturulur
        // Ekleme ve cikartma yapilamaz
        List<Character> initials = List.of('a','k','c','d','k');
        System.out.println(initials);


        //indexOf(aranan karakter) aranan karekterin ilk gorunumunun index'ini verir
        int r1 = initials.indexOf('k');
        System.out.println(r1);

        //lastIndexOf(aranan Karakter) methodu aranan karakterin son index gorunumunu verir.
        int r2 = initials.lastIndexOf('k');
        System.out.println(r2);

















    }
}
