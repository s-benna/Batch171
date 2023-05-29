package day07StringManipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*
        Ornek: Asagida ki kurallara gore kullanicinin girdigi password'leri kontrol ediniz.
               1) En az 8 character olsun.
               2) Space characteri olmasin.
               3) En az bir rakam, kucuk ve buyuk harf olsun.
         */
        Scanner password = new Scanner(System.in);
            System.out.println("Lutfen parolanizi giriniz.");
        String pwd = password.nextLine();
                //1- en az 8 karakter olsun.
        boolean first = pwd.length()>7;
            System.out.println("Ilk asama: "+first);

                //2- space olmasin
        boolean second = !pwd.contains(" ");//(! ile olumsuz yaptik.)
            System.out.println("Ikinci asama: " + second);

                //3- En az bir buyuk harf olsun
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;//Methodlari ayni satirda yan yana kullanmaya methocahin denir.
            System.out.println("Ucuncu asama: " + third);

                //4- En az bir kucuk harf olsun.
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
            System.out.println("Dorduncu asama: " + fourth);

                //5- En az bir rakam olsun.
        boolean fifth = pwd.replaceAll("[^0-9]", "").length()>0;
            System.out.println("Besinci asama: " + fifth);

        System.out.println("Parola gecerli mi?: " + (first && second && third && fourth && fifth));
        //Parolamiz tum kurallara uydugunu kontrol etmek icin 'AND(&&)' logical operator u ile kontrol ettiriyoruz.



























    }//main
}//class
