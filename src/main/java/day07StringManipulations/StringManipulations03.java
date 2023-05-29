package day07StringManipulations;

public class StringManipulations03 {

    public static void main(String[] args) {
        //Ornek-1 : Bir String'in bos ve sonunda Space character'i varsa siliniz.
        //"   Ali Can   " ==> "Ali Can"

        String s = "   Ali Can   "; // trim method'u bir string' in bas ve sonunda ki space characterælerini siler, orta
                                    // space'lere dokunmaz.
        String sTrimmed = s.trim();
        System.out.println(s);
        System.out.println(sTrimmed);

        //Ornek-2: Asagida ki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        String tv = "$456.99";
        String laptop ="$875.99";

        String tv1=tv.replace("$","");
        System.out.println(tv1);
        String laptop1=laptop.replace("$","");
        System.out.println(laptop1);

        double totalPrice=Double.valueOf(tv1)+Double.valueOf(laptop1);
        System.out.println("Toplam fiyat: " + totalPrice);

        //Ornke-3:Verilen ismin ilk harfini ve soy isminin ilk harfini ekrana yazdirin.
        //"   ALi Can   " ==> "AC"
        /*
        NOT: split() methodu bir String' i istedigimiz karakterden bolmek icin kullanilir.
         */
        String name = "    ali Can   ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println("Ilk harf: " + first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("Ikinci harf: " + second);

        System.out.println(""+first+second);


































    }//main
}//class
