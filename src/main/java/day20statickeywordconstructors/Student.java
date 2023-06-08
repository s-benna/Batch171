package day20statickeywordconstructors;

public class Student {

        /*
            1- Static variable veya static methodlar (class member) tum object'ler icin ortak elemandir.
            2- Static class emmber'lar izerinde yapilan tum degisiklikler tum object'leri etkiler.
            3- Static class member'lar class', non-static class member'lar object'lere monte edilir.
            Mesela bir class'tan 100 tane object olusturduugnuzda, non-static olanlar 100 kere olusturulur, ama
            static olanlar object sayisindan bagimsiz olarak bir kere olusturulur.
            4- Static class member'lara ulasmak icin object olusturmaya gerek duyulmaz, ama non-static class member'lara
            ulasmak icin object olusturmak sarttir.
            5- Static variable'larin diger adi "Class variable"dir.
               non-static variable'larin diger adi "Instance Variable" veya "Object Variable"dir.

        */
         public static String stdName = "Tom Hanks";

         public int age = 13;

        public static void staciMethod(){
            System.out.println("Ben static methodum");
        }

        public void nonStaticMethod(){
            System.out.println("Ben static method degilim");
        }



}
