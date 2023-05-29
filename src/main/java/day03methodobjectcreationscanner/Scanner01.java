package day03methodobjectcreationscanner;
//Java'nin util kuutphanesinden scanner class import edildi.
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Adim-1: Scanner Class'dan tam object olustur.
        Scanner input = new Scanner(System.in);


        //Adim-2: Kullaniciyi yonlendir.
        System.out.println("Lutfen yasinizi giriniz...");

        //Adim-3: Uygun method'u kullanarak kullanicinin verdigi datayi memory'e yerlestiriniz.
        byte age=input.nextByte();
        System.out.println(age);

        System.out.println("age = " + age);
    }
}
