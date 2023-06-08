package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class day11Tekrar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("1-Cinsiyet giriniz. \n\tErkek ise E \n\tKadin ise K \n2- 0 ile 120 arasi sayi girin");
        String cinsiyet = input.next();
        int yas = input.nextByte();

        if (yas<0 || yas >120){
            System.out.println("Lutfen belirtilen aralikta sayi girin");
        }else if (cinsiyet.equalsIgnoreCase("K")){
            if (yas>60){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Emekli olamazsiniz");
            }
        }else if (cinsiyet.equalsIgnoreCase("E")){
            if (yas>60){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Emekli olamazsiniz");
            }
        } else {
            System.out.println("Tekrar edin.");
        }

        System.out.println("**************************");

        int alinanSayi = input.nextInt();

        String ornek2 = alinanSayi<10 ? "Kucuk" : "Buyuk";//condition dogru ise (:)'nin solu, yanlis ise sagi calisir
        System.out.println(ornek2);

        //Ornek-2: Sayi cift ise console a "cift" , tek ise "Tek" yazdirin.

        String ornek3 = alinanSayi%2==0 ? "cift" : "tek";
        System.out.println(ornek3);

        /*
        1) Increment artirmak demektir, decrement azaltmak demektir.
        2) Increment toplama ve carpma ile, decrement cikarma ve bolme ile yapilabilir
                a)i=i+5;
                b)i+=5;
                c)eger 1 ile artirma ==> i++
                note:bu c sikki sadece 1 artirmak icin kullanilir

                a)i=i-5;
                b)i-=5;
                c)eger 1 ile azaltma ==> i--
                note:bu c sikki sadece 1 azaltmak icin kullanilir

         */




























    }//main
}//class
