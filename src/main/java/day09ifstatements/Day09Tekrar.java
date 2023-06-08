package day09ifstatements;

import java.util.Scanner;

public class Day09Tekrar {
    public static void main(String[] args) {
        /*
        if statment'lar ihtimal duurmlarinda kullanilir.
         if (kosul yazilir) {calistirilacak kod yazilir}
         */

        int number = -123;
        number=Math.abs(number); // Math.abs metotu sayilarin mutlak degerini alir.

        if (number>99 && number<1000){ // eger sayi 99dan buyuk ve 1000 den kucukse, kod calisir
            System.out.println("sayi 3 basamaklidir");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Character giriniz");
        char ch = input.next().charAt(0);

        if (ch >= 'A' && ch<='Z'){           // Buyuk A ile Z arasini kontrol et
            System.out.println("Buyuk harf");
        } else if (ch >= 'a' && ch<='z') {   // Kucuk a ile z arasini kontrol et
            System.out.println("Kucuk harf");
        }else {                              // Iki ihtimal disi ise burayi yazdir
            System.out.println("Harf degil");
        }
    }
}
