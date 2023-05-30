package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        // Ornek-1: String Array olusturun icine 5 tane eleman ekleyin,
        // ilk eleman ile son elemanin icerdigi karakter sayilarini toplamini yazdirin.

         String ornek1 [] = new String[5];

        ornek1[0] = "Ali";
        ornek1[1] = "Veli";
        ornek1[2] = "Deli";
        ornek1[3] = "Zirdeli";
        ornek1[4] = "Darendeli";

        System.out.println(Arrays.toString(ornek1));//[Ali, veli, deli, zirdeli, darendeli]

        System.out.println(ornek1[0].length() + ornek1[ornek1.length - 1].length());//12

        String brr [] = new String [5];
        brr[0]  = "Miami";
        brr[1]  = "İstanbul";
        brr[2]  = "Ankara";
        brr[3]  = "Oslo";
        brr[4]  = "Erzurum";

        int totalChar = 0;
        for (int i = 0; i< brr.length; i++){
            totalChar = totalChar+brr[i].length();
        }
        System.out.println("Ornek-1.1: "+totalChar);

        // 2.Yol (for each loop)
        // Baslangic degeri, loopun calisma sarti ve increment/decrement kismini kendisi halleder
        // for-each-loop "Array" lerde ve "Collection" larda kullanilir.
        /*
            Java collection ve Arraylere ozel for each loop olusturmus.  Hata payi cok az
            Egerki Array ve collection ile calisyorsak ilk tercih For each Loop olmalidir.
         */

        // for (Data Type variableName(genellikle-w konulur) : arr/collection ){
        // calisacak kod yazilir}

        int sum = 0;
        for (String w : brr ) {
            sum = sum + w.length();
        }
        System.out.println("Ornek-1.2: "+sum);

        //  Ornek-2: int data type de 6 adte elemanin ortalamsini yazdirin.
        int notlar [] = new int[6];

        notlar[0]= 79;
        notlar[1]= 56;
        notlar[2]= 23;
        notlar[3]= 89;
        notlar[4]= 55;
        notlar[5]= 99;

        int ort = 0;
        for (int w: notlar) {
            ort = (ort+w);

        }// notlar.length ile kac adet kutu varsa ona boldu. suan 6 oldugu icin 6yi otomatik aldi.
        System.out.println("Ornek-2: "+ort/notlar.length);


    }
}
