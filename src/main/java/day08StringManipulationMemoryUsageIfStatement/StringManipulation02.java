package day08StringManipulationMemoryUsageIfStatement;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Ornek-1:Bir String' in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz.
        // abc@gmail.com ==> gmail

        String a = "asndbc@hotmail.com";

        int startingIndex = a.indexOf('@')+1;
        int endindIndex = a.indexOf('.');
        String companyName = a.substring(startingIndex,endindIndex);
        System.out.println("Ornek-1: " + companyName);

        System.out.println("Hard coding: "+a.substring(4, 9));

        //Ornek-2: Verilen iki String' in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz.
        String h = "ali Can";
        String i = "Ali Can";

        boolean result = h.equals(i);
        System.out.println("Ornek-2: " + result);

        /* Java' da Memory kullanimi;
           1) Stack Memory ==> small
                a- Kucuk memory'dir
                b- Primitive datalari icerir fakat non-primitive data'larin adreslerini (reference) tutar.
           2) Heap Memory ==> Huge
                a- Buyuk memory'dir.
                b- non-primitive datalari icerir.
            * * * Java heap memory'de yerlestirline tum non-primitive datalar icin bir adres olusturur ve bu adresi stack
           memory'de saklar. * * *
        */

         /*
            Not: String'lerin esitliklerini kontrol ederken "==" yerine "equals ()" method'u kullanilir.
            Cunku; "==" sembolu iki string'i karsilastirirken hem adreslerine hem dedegerlerine bakar, ikiside ayni ise stringler esittir.
            Ama biz code yazarken genellikle String'lerin adresleri ile ilgili degil degerleri ile ilgileniriz.
            Bu yuzden String karsilastrimalarinada "==" kullanmaliyiz.
            "equals()" methodu ise iki String'i karsilastirirken sadece degerlerine bakar, degerleri ayni ise bu iki String' esittir der,
            farkli ise bu iki String farklidir der.
            Bu bizim kod yazarken ihtiyac duydugumuz seydir.
          */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");

        System.out.println(s==t);//false cunku adresler ve degerler farklidir.
        System.out.println(s.equals(t));//false cunku degerler farkli
        System.out.println(s==r);//false
        System.out.println(s.equals(r));//true cunku equals() sadece degerlere bakar. 's' ve 'r' nin degerleri ayni oldugunda

        //*******************************************************************************


        // Ornek-3: Verilen iki String' in birbirinin aynisi olup olmadigini buyuk harf-kucuk harf dikkata almadan kontrol ediniz.

        String h1 = "ali Can";
        String i1 = "Ali Can";
        boolean or3 = h1.equalsIgnoreCase(i1);// Dikkate almadan kontrol eder.
        System.out.println("Ornek-3: " + or3);


        /* HOMEWORK
            1- Bir String variable olusturunuz ve bu String'de ki rakam olmayan tum karakterlerin sayisini console'a
               yazdiriniz.

            2- Bir String variable olusturunuz ve ilk karakter ile son karakter disinda ki tum characterleri console'a
               buyuk harflerle yazdiriniz.

            3- Bir String variable olusturunuz ve bu String'de ki ilk ve son character'lerin ASCII degerleri toplamini
               console yazdiriniz.

            4- Tek kelimeli bi sehir ismi icin Strin Variable olusturun ve sehir isminin ilk harfini buyuk, diger harflerinin
               kucuk harflerle yazdiriniz.

            5- Asagida ki kurallara gore kullanicin girdigi password' u kontrol ediniz
               a- En az 6 character
               b- En az 1 tane buyuk harf olsun
               c- En az 1 tane kucuk harf olsun
               d- En az 1 tane rakam olsun
            Not-1: Once canli oturum sirasinda cozulen ornekleri yapiniz.
            Not-2: Tum sorulari dinamik kodlarla cozulmelidir.
            Not-3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir veya yardim isteyebilirsiniz.
        */




























    }//main
}//class
