package day21arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        // Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz.
        // Iki List'in esit olabilmesi icin ayni index'te ayni eleman olmalidir.

        ArrayList<String> names1 = new ArrayList<>();

        names1.add("Tom");
        names1.add("Kim");
        names1.add("Jim");

        ArrayList<String> names2 = new ArrayList<>();

        names2.add("Tom");
        names2.add("Jim");
        names2.add("Kim");

        System.out.println(names1.equals(names2));//false

        // Size verilen iki int list tamamiyla ayni olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);
        System.out.println(nums1.equals(nums2));

        //ArrayList bir elemanin ilk gorunumu nasil silinir
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");

        System.out.println("\t"+cities);

        //remove() methodu bir elemanin ilk gorunumunu siler
        cities.remove("Miami");
        System.out.println(cities);

        //index kullanilarak nasil silinir.
        String silinen = cities.remove(1);
        System.out.println("2 "+silinen);

        // remove() methodu index ile kullanilirsa size silmis oldugu datayi return eder
        // remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden boolean return eder.



        // ArrayList olustururken sag tarafa(Constructor) olusturmak zorundasiniz.
        // Ama sol tarafa ister ArrayList isterseniz de List yazbilirsiniz

        // Ornek: Bir integer List olusturun ve 12 elemanini Listden siliniz
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(8);


        // 1.yol
//        Integer nonPrimitive = 12;
//        ages.remove(nonPrimitive);
//        System.out.println(ages);

        //2.Yol
//        ages.remove((Integer) 12);
//        System.out.println(ages);

        //3.yol
//        ages.remove(Integer.valueOf(12));
//        System.out.println(ages);

        //4.yol
        ages.remove(ages.indexOf(12));
        System.out.println(ages);

        // Bir ArrayList teki bir elemanin tum uyelerini nasil sileriz?
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Yozgat");
        citiesToRemove.add("Istanbul");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);


















    }
}
