package day08StringManipulationMemoryUsageIfStatement;

public class StringManipulation01 {
    public static void main(String[] args) {

        // Ornek-1: Bir String' in hic character icermedigini (Bos String oldugunu) kontrol eden kodu yaziniz.
        //1. YOL==>
        String a = "";
        boolean Ornek1 = a.length()==0;
            System.out.println("String bos mu?: " + Ornek1);//String bos mu?: true

        //2.YOL ==> Tavsiye edilir
        //Java eger bir konuda method olusturmus ise o method'u kullanmak en iyidir.
        boolean Ornek2  = a.isEmpty();
            System.out.println("Is Empty?: " + Ornek2);//Is Empty?: true


        // Ornek-2: Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz.
        //1.YOL ==>
        String t ="     ";
        boolean result3 = t.replaceAll(" ","").length()==0;
            System.out.println("Ornek-2.1: " + result3);//Ornek-2.1: true

        //2.YOL ==>
        boolean result4 = t.replaceAll(" ","").isEmpty();
            System.out.println("Ornek-2.2: " + result4);//Ornek-2.2: true

        //3.YOL ==>
        boolean reslut5 = t.isBlank();
            System.out.println("Ornek-2.3: " + reslut5);//Ornek-2.3: true
        /* NOT:isBlank() method'u sadece 'space' iceren String'ler icin true verir, 'space' disinda bir character var ise
               false verir.
               isBlank() method' u bos String'ler icin de true verir.
               isBlank() method' u space + hic birsey icin true verir.
               isEmpty() method' u sadece hic birsey("") icin true verir.
        */

        // Ornek-3: Bir String'de a, i, e characterlerinin ilk gorunumlerinin index'leri toplamini ekrana yazdiriniz.
        // "Java is easy to learn" ==> 1+5+8=1=4
        //  0123456789.......

        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1
        int idxI = r.indexOf('i');
        System.out.println(idxI);//5
        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

       System.out.println("Ornek-3: " + (idxE+idxA+idxI));//14

       //Ornek-4: Bir String'de ki "Java" kelimesinin ilk olarak kacinci index'te kullanildigini gosteren kodu yaziniz.
       // "Ah Java vah Java sensiz olmuyor Java."

        String j = "Ah Java vah Java sensiz olmuyor Java.";
        int idxJava = j.indexOf("Java");
        System.out.println("Ornek-4: " + idxJava);//3

        //  NOT: indexOf("Java") kullaniminda siz "Java" kelimesinin ilk harfin 'J' index ini almis oldunuz.

        int idxjava = j.indexOf("java");
        System.out.println("Ornek-4.1: " + idxjava);//-1

        //indexOf() method'u olmayan character'ler icin kullanilirsa her zaman -1 return eder.

        //Ornek-5: Bir String'de a, i, e characterlerinin son gorunumlerinin index'leri toplamini ekrana yazdiriniz.
        String v = "Java is easy to learn";
        int a1 = v.lastIndexOf('a');
        System.out.println(a1);//5
        int i1 = v.lastIndexOf('i');
        System.out.println(i1);//17
        int e1 = v.lastIndexOf('e');
        System.out.println(e1);//18

        System.out.println("Ornek-5: " +(a1+i1+e1));//40


    }//main
}//class
