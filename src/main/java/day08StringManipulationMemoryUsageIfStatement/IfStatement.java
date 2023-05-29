package day08StringManipulationMemoryUsageIfStatement;

public class IfStatement {
    public static void main(String[] args) {
        // if statement
        //bazi kodlarin bazi sartlara gore aktive edebilmek icin if statements kullanilir.
        // if==eger ==> if statement ==> kosul cumlesi

        // if you study hard, you can learn Java.


        /*if (you study hard){you can learn Java  }*/

        //Ornek-1: Sayi pozitif ise ekrana pozitif yazdirin.

        int num = 13;

        if (num>0){
            System.out.println(num +"==> pozitiftir");
        }

        //Ornek-2: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin. *** -1<n<10 == n>-1 && n<10 **

        int n = 5;
        if (n>-1 && n<10){
            System.out.println("Rakam");
        }











    }
}
