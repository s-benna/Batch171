package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        // Ornek-1: Kullanicidan coklu data'yi bir arraye yerlestirebilmesi,
        // istedigi zaman durdurabilmesi isin gereken kodu yaziniz.

    /*
        1- Kullanicidan data almak icin Scanner object olustur.
        2- Coklu data'yi yerlestirmek icin array olusturmaliyiz.
        3- Array olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyiz.
        4- Loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen eklemek istediginiz ogrenci sayisini giriniz..");
        int numOfElements = input.nextInt();

        String stdName [] = new String[numOfElements];

        System.out.println("Islemi durdurmak icin 'q' ya basiniz..");

        for (int i = 0; i< stdName.length  ;i++){

            System.out.println((i+1) +". ogrencinin adiniz giriniz..");
            String name = input.next();
            if (name.equalsIgnoreCase("q")){
                break;
            }else {
                stdName[i]=name;
            }

        }
        System.out.println(Arrays.toString(stdName));
















    }
}
