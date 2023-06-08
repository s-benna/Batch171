package day06swapvaluesstringmanipulations;

public class Day06Tekrar {
    public static void main(String[] args) {

        String s = "benna";
        System.out.println(s.toUpperCase());//BENNA
        // toUpperCase tum harfleri buyutur.

        String z = "ISTANBUL";
        System.out.println(z.toLowerCase()); //istanbul
        // toLowerCase tum harfleri kucultur.

        System.out.println(s.charAt(0)); // 'b'
        //charAt() metodu 0 iken ilk harfi alir.

        char sonHarf = z.charAt(7); // Stringin son harfini almak icin son kelime daima toplam sayidan 1 eksiktir.
                                    // Cunku ilk harf 0'dan baslar.

        char sondanIkinciHarf = z.charAt(6);
        System.out.println(""+sondanIkinciHarf+sonHarf); // Basina "" koymamizin sebebi ASCII degerini yazdirmamasi icin

        String t = "Cekoslavakya";
        System.out.println(t.length()); // 12
        // length () String uzunlugunu verir.

        System.out.println(t.substring(3, 7)); //osla
        //substring metot bir stringde ki belirligi araligi almak icin kullanilir.


        String s1 = "Java is easy";
        boolean containsTest = s1.contains("is");
        System.out.println(containsTest); // true
        //contains metotu belli bir kelimenin varligini kontrol eder. Varsa true, yoksa false verir.(boolean cevirir)


        int a =12;
        int b =17;
        int temp = 0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp = a;
        a=b;
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
