package day10ifstatements;

import java.util.Scanner;

public class De {

    public static void main(String[] args) {
        // Soru-1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        // 1==> Pazar, 2 ==> Pazartesi .....

        System.out.println("Lutfen kacinci gun oldugunu giriniz...");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int kalan = num % 7;

        if       (kalan == 0){
            System.out.println("Sunday");
        } else if(kalan == 1) {
            System.out.println("Monday");
        } else if(kalan == 2) {
            System.out.println("Tuesday");
        }else if (kalan == 3) {
            System.out.println("Wednesday");
        }else if (kalan == 4) {
            System.out.println("Thursday");
        }else if (kalan == 5) {
            System.out.println("Friday");
        }else if (kalan == 6) {
            System.out.println("Saturday");
        }
        else {
            System.out.println("Hatali sayi girdiniz Lutfen 1 ile 7 arasi sayi giriniz...");
        }

    }
}