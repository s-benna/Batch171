package day04scannerwrapper;

import java.util.Scanner;

public class Day04Tekrar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi yaziniz.");
        String isim = input.nextLine();

        System.out.println("Soyadinizi yaziniz.");
        String soyisim = input.nextLine();

        System.out.println("Isimi ve Soyisim: "+isim+" "+soyisim);

        //Ornek: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        System.out.println("Birinci sayiyi gir");
        int ilkSayi = input.nextInt();

        System.out.println("Ikinci sayiyi gir");
        int ikinciSayi = input.nextInt();

        System.out.println(ilkSayi+ikinciSayi);
        System.out.println(ilkSayi-ikinciSayi);
        System.out.println(ilkSayi*ikinciSayi);
        System.out.println(ilkSayi/ikinciSayi);

    }
}
