package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*
        1) Ayni data type indaki coklu datalari depolamak icin Array kullaniriz
        2) Arraylerin negatif bir yonu var, icine koyacağınız eleman sayisini en basta belirlemek zorundasiniz
        3) Arrayler eleman sayisinda esnek degildirler, bu yuzden java Arraylist adli yeni bir yapi olusturdu
        Bu yapi eleman sayisinda esnekdir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
        1000 eleman koyarsaniz eleman sayisni 1000 olarak ayarlar
        4) Arraylist yerine sadece List de diyebilirsiniz
        5) Java Arraylistleri olusturduktan sonra Array leri iptal etmedi cunku;
            a)Array ler super hizlidir.
            b)Array ler memory de cok az yer kaplar.
            c)Bu nedenle eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir
        6) Arrayler pirimitive data type lari ve "reference" lari depolayabilir.
           Ama ArrayList ler non-primitive data type lari depolar, bu nedenle Arraylistler Arraylerden
           daha fazla yer kaplarlar
         */

        // ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        //ArrayList konsola nasil yazdirilir?
        System.out.println(ages);

        // ArrayListe eleman ekleme nasil yapilir?
        // ArrayListlere eleman eklemek iicn add() methodu kullaniriz.
        // add() methodu elemanlari sizin verdiginiz sirada List'e ekleme yapar. (Insertion Order)
        ages.add(9);    //0.sira
        ages.add(12);   //2.sira
        ages.add(10);   //4.sira
        ages.add(1, 540); //1.sira
        ages.add(3, 777); //3.sira
        ages.add(888); // son sira
        System.out.println(ages);

        // List'e coklu eleman nasil eklenir? veya List'e baska bir list nasil eklenir?
        // Bir list'e coklu eleman eklemek icin o elemanlari once bir list'in icine koymalisiniz.

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges); // [9, 540, 12, 777, 10, 888]

        ages.addAll(newAges); // [8, 9, 10]
        System.out.println(ages); // [9, 540, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages); //[9, 540, * 8, 9, 10 *, 12, 777, 10, 888, 8, 9, 10]

        // AarrayListe eleman sayisi nasil bulunur?
        // size() method bir list'teki eleman sayisini verir.

        int numOfElement = ages.size();
        System.out.println(numOfElement); //12

        //ArrayListe specific bir eleman nasil alinir?
        // get() methodu index kullanarak istedigimiz elemani almaya yarar.

        int elemanBir = ages.get(1);
        System.out.println(elemanBir);//540

        //ArrayList'te spesifik bir eleman nasil degistirilir.
        ages.set(6,111);// basta ki index, 111 de yeni rakam
        System.out.println(ages);//[9, 540, 8, 9, 10, 12, 111, 10, 888, 8, 9, 10]
        ages.set(4,113);
        System.out.println(ages);//[9, 540, 8, 9, 113, 12, 111, 10, 888, 8, 9, 10]

        // Bir List'teki tum elemanlari nasil silinir?
//        ages.clear();
//        System.out.println(ages);

        // Spesific bir elemani kontrol etme
        boolean r = ages.contains(540);
        System.out.println(r);//true


        // Bir ArrayList'in bos olup olmadiigini kontrol etme
        boolean r2 = ages.isEmpty();
        System.out.println(r2);//false

        // Ornek : size verilen List'in bos olmadigini kontrol ediniz

        ArrayList  <String> names = new ArrayList<>();
        names.add("Saadet");
        names.add("Kasim");
        names.add("Ekim");
        names.add("Ali");

        // 1. Yol

        if (names.size()==0){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }

        names.clear();
        //2. Yol
        if (names.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }

        /* Bir method ogrenirken 3 seyi ogrenin
            1-method nasil yapilir
            2-method nasil kullanilir
            3-method size neyi verir              */



























    }//main
}//class