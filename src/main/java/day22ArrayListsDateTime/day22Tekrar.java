package day22ArrayListsDateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day22Tekrar {
    public static void main(String[] args) {

        // Ornek-1: Bir Listteki tekrarsiz elemanlari console yazdiran kodu yazin

        List<Double> price = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for (double w:price) {
            if (price.indexOf(w)== price.lastIndexOf(w)){
                System.out.println("Ornek-1: "+w);
            }
        }

        // Ornek 2: Bir Listteki tekrarli eleman olup olmadiigni bulan kodu yaziniz.

        List<Integer> heights = List.of(13, 13, 3, 45, 17, 22, 3);

        int counter = 0;
        for (int w:heights) {
            if (heights.indexOf(w) != heights.lastIndexOf(w)){
                System.out.print(w+" "); // Hangi elemanin tekrar ettigini bulduk.
            counter++; // Tekrarli eleman ciktikca sayiyi bir artiracak.
           //break;  // sadece bir eleman tekrar etse bizim icin yeterli oldugundan devamini getirmemesi icin
                     // break koyduk. Eger break koymazsak List'in hepsini kontrol eder ve hangileri tekrarli
                     // yazdirabiliriz.
            }
        }
        System.out.println();
        if (counter==0){ // sayac hic degismezse if calisir
            System.out.println("Tekrarsiz eleman yok");
        }else { // sayac 1 ve 1den fazla oldugu zaman else calisir
            System.out.println("Tekrarli eleman en az 1 tane var");
        }

        System.out.println(" * * * * * * list02 * * * * * * ");

        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        /*
        Collection kullanılmasının nedeni, farklı türlerden verileri depolayabilen ve
        bu verilere genel bir şekilde erişim sağlayabilen bir arayüz olmasıdır.
        List<Integer> ifadesi, Integer türünden verilerin bir listesini temsil eder.
        Listeler, elemanların sırasını koruyabilen ve aynı elemanın birden fazla kez
        eklenebileceği veri yapılarıdır.        */

        Collections.sort(nums); // Listi kucukten buyuge siraladik
        int minD = nums.get(1)-nums.get(0); // Kucukten buyuge oldugu icin index 1'den 0.index'i cikardik
        for (int i = 1; i < nums.size(); i++) { // donguyu soyledik list boyutu kadar dondurecek
            minD = Math.min(minD, nums.get(i)-nums.get(i-1)); // mind ile index farklarini karsilastirdik
                                                              // her seferinde kontrol edecek
        }
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i)- nums.get(i-1)==minD){ // guncellenen minD ile index farkini aldirdik
                System.out.println(nums.get(i)+" ve "+ nums.get(i-1));
            }
        }

        System.out.println(" * * * * * * list03 * * * * * * ");























    }
}
