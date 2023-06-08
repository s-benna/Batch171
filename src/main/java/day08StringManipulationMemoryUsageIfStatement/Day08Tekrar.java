package day08StringManipulationMemoryUsageIfStatement;

public class Day08Tekrar {
    public static void main(String[] args) {

        String a = "";
        boolean ornek1 = a.isEmpty();
        System.out.println(ornek1);
        //isEmpty() methodu stringi bos olup olmafigina bakar

        // isBlank() methodu sadece space iceren String'ler icin true verir.


        String mail = "bensoz@gmail.com";

        int baslangic = mail.indexOf('@')+1;// Burada @ harfinden sonraki almasi icin +1 ekledik
        int son = mail.indexOf('.'); //nereye kadar alacagini soyledik
        String mailAdi = mail.substring(baslangic,son); //substring metotu ile bunlari birlestirdik
        System.out.println(mailAdi); // gmail
        // mail.substring(4,9); yapsaydik kullanicinin @ den sonra kac kelime girecegini bilmiyoruz.
        // bildigimiz parametetreler @ ve . oldugu icin ve bu aralik istenidigi icin bu yontemi yaparsak
        // istedigimiz sonucu almama sansimiz yuksek.




    }
}
