package day10ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ay ismini giriniz...");

        String ayAdi = input.nextLine();//Sadece equals deseydik kucuk/buyuk harf hassasiyeti olacagindan equalsIgnoreCase yazdik

        if (ayAdi.equalsIgnoreCase("Januray") ){
            System.out.println(1);
        } else if (ayAdi.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (ayAdi.equalsIgnoreCase("March")) {
            System.out.println(3);
        }
        else if (ayAdi.equalsIgnoreCase("March")) {
            System.out.println(3);
        }
        else if (ayAdi.equalsIgnoreCase("April")) {
            System.out.println(4);
        }
        else if (ayAdi.equalsIgnoreCase("May")) {
            System.out.println(5);
        }
        else if (ayAdi.equalsIgnoreCase("June")) {
            System.out.println(6);
        }
        else if (ayAdi.equalsIgnoreCase("July")) {
            System.out.println(7);
        }
        else if (ayAdi.equalsIgnoreCase("August")) {
            System.out.println(8);
        }
        else if (ayAdi.equalsIgnoreCase("September")) {
            System.out.println(9);
        }
        else if (ayAdi.equalsIgnoreCase("October")) {
            System.out.println(10);
        }
        else if (ayAdi.equalsIgnoreCase("November")) {
            System.out.println(11);
        }
        else if (ayAdi.equalsIgnoreCase("December")) {
            System.out.println(12);
        }
        else {
            System.out.println("Lutfen ay ismi giriniz...");
        }


    }
}
