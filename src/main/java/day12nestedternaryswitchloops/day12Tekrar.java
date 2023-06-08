package day12nestedternaryswitchloops;

import java.util.Scanner;

public class day12Tekrar {
    public static void main(String[] args) {
        /*    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
               1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
               2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
        */


        int year = 120;
        String sonuc = year %100==0 ? (year%400==0 ? "Artik yil": "Artik yil degil")
                    : (year %4==0 ?"Artik yil": "Artik yil degil");
        System.out.println(sonuc);
        System.out.println("************************************");

        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7


        String gunAdi = "Pazartesi";

        switch (gunAdi.toLowerCase()){
            case "pazartesi":
                System.out.println(1);
                break;
            case "sali":
                System.out.println(2);
                break;
            case "carsamba":
                System.out.println(3);
                break;
            case "persembe":
                System.out.println(4);
                break;
            case "cuma":
                System.out.println(5);
                break;
            case "cumartesi":
                System.out.println(6);
                break;
            case "pazar":
                System.out.println(7);
                break;
            default:
                System.out.println("gecerli gun gir");

        }
        /*
        Note : "switch" condition parantezi icinde String, int, byte, short, char kullanilabilir
        Note : "switch" condition parantezi icinde long, boolean, float, double kullanilamaz.   */

        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini
        // yapan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi girin.\nYapilacak islemi secin +, -, *, /, %");

        double a = input.nextDouble();
        double b = input.nextDouble();

        char ch = input.next().charAt(0);

        switch(ch){
            case '+':
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            case '-':
                System.out.println(a+" + "+b+" = "+(a-b));
                break;
            case '*':
                System.out.println(a+" x "+b+" = "+(a*b));
                break;
            case '/':
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            case '%':
                System.out.println(a+" + "+b+" = "+(a*b)/100);
                break;
            default:
                System.out.println("Tanimsiz islem");
        }







    }
}
