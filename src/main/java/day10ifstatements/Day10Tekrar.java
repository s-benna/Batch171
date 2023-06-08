package day10ifstatements;

import java.util.Scanner;

public class Day10Tekrar {
    public static void main(String[] args) {

        //equalsIgnoreCase() metotu buyuk-kucuk harf hassasiyeti icermeden esitlige bakar

        Scanner input = new Scanner(System.in);
        System.out.println("Yasinizi girin");
        int yas = input.nextInt();

        if (yas<0){
            System.out.println("Gecerli yas girniz");
        } else if (yas<5) {
            System.out.println("Bebek");
        } else if (yas<13){
            System.out.println("Cocuk");
        } else if (yas<21) {
            System.out.println("Genc");
        } else if (yas<31) {
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimsiz yas");
        }


        System.out.println("3 adet sayi giriniz.");
        double a =Math.abs(input.nextDouble());
        double b =Math.abs(input.nextDouble());
        double c =Math.abs(input.nextDouble());

        boolean ucgenMi = (a+b>c && c>Math.abs(a-b))&&
                          (a+c>b && b>Math.abs(a-c))&&
                          (b+c>a && a>Math.abs(b-c));


        if (ucgenMi){
            if (a == b && b==c){
                System.out.println("Eskenar ucgen");
            }else {
                System.out.println("Normal ucgen");
            }
        }else {
            System.out.println("Ucgen degil");
        }







    }//main
}//class
