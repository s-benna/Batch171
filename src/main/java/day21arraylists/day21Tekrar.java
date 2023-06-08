package day21arraylists;

import java.util.ArrayList;

public class day21Tekrar {
    public static void main(String[] args) {

        /*
            ArrayList formulu
            Array <Integer> ozelIsim = new Arraylist <> () ;
           <> ==> diamond denir ve bunun icine Wrapper deger ne olacaksa o yazilir.
           Ornegin; Integer, Double, Character .... gibi
           Yeni bir class olusturdugumuz de new keyword'u yazmaliyiz.
           Bundan dolayi ArrayList bir class'dir.

        */

        ArrayList<Integer> gunTekrari = new ArrayList<>();

        //Yazdirma islemi
        System.out.println(gunTekrari); // []

        //ArrayListe eleman ekleme add(ekle) metotu cagiralarak yapilir.

        gunTekrari.add(8);  // ArrayList'te 0. eleman
        gunTekrari.add(12); // ArrayList'te 1. eleman
        gunTekrari.add(17); // ArrayList'te 2. eleman
        gunTekrari.add(44); // ArrayList'te 3. eleman

        System.out.println(gunTekrari); // [8, 12, 17, 44]

        // Eger varolan ArrayListe yeni eleman eklersek, eklenen eleman en sona yazilir.
        gunTekrari.add(2,23); // index==> hangi siraya gidecegini belirtiyor
                                           // element ==> elemani gosteriyor.
        // Boylece istenilen siraya eleman eklenmis olduk.

        ArrayList<Integer> newGunTekrari = new ArrayList<>();
        newGunTekrari.add(12);
        newGunTekrari.add(36);
        newGunTekrari.add(65);

        // Bir ArrayList'e paket olarak baska ArrayList eklemek istersek,
        gunTekrari.addAll(newGunTekrari);
        System.out.println(gunTekrari); //[8, 12, 23, 17, 44, 12, 36, 65]
        // addAll() metotu icinde ekleyecegimiz ArrayList yazilir.

        // Hangi index'ten baslamsini istersek index yazilir daha sonra;
        // eklecegimiz ArrayList adi yazilir
        newGunTekrari.addAll(2,gunTekrari);
        System.out.println(newGunTekrari); // [12, 36,* 8, 12, 23, 17, 44 *, 12, 36, 65, 65]
                                           // *' dan baslayarak *' a kadar elemanlari ekledi

        // ArrayList'ten spesific elemani almak
        int elemanAl = newGunTekrari.get(4); //12

        // ArrayList uzunluguna bakma
        System.out.println(newGunTekrari.size()); // 11
        //size() metotu ile boyutuna bakmis olduk.

        //ArrayList'te spesifik bir eleman nasil degistirilir.
        gunTekrari.set(2,77);
        System.out.println(gunTekrari); // index 2'de bulanan 23, 77 ile degisti.

        //ArrayList'i silmek icin clear() metotu kullanilir
        //gunTekrari.clear();

        // Belli bir elemani kontrol etme
        boolean kotrol = newGunTekrari.contains(17);
        // yazilan eleman ArrayList icinde ise true, yoksa false return eder
        System.out.println(kotrol); //true

        // Bir ArrayList'in bos olup olmadiigini kontrol etme
        boolean kontrol2 = newGunTekrari.isEmpty();
        System.out.println(kontrol2); //false

        // Ornek : size verilen List'in bos olmadigini kontrol ediniz

        if (gunTekrari.isEmpty()) {
            System.out.println("ArrayList bos");
        }else {
            System.out.println("ArrayList' e en az 1 eleman var");
        }

        // Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz.
        ArrayList<String> names1 = new ArrayList<>();

        names1.add("Tom");
        names1.add("Kim");
        names1.add("Jim");

        ArrayList<String> names2 = new ArrayList<>();

        names2.add("Tom");
        names2.add("Jim");
        names2.add("Kim");

        System.out.println(names1.equals(names2)); //false

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

        cities.remove("Yozgat"); //boolean cevirir
        System.out.println("\t"+cities);//[Miami, Istanbul, Barcelona, Miami, Istanbul, Istanbul, Yozgat]
        //                                    0       1         2         3       4         5        6
        //index kullanilarak nasil silinir.
      //System.out.println(cities.remove(2));// 2. index Barcelona ve silinen index gosterir
        // Baska bir sepete koyarsak yeni ArrayList ile silinen object olmamsi olacaktir.
        String silinen = cities.remove(2);
        System.out.println("1 "+silinen); // 1 Barcelona

        // remove() methodu index ile kullanilirsa size silmis oldugu datayi return eder
        // remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden boolean return eder.
    }
}
