package day13loops;

public class day13Tekrar {
    public static void main(String[] args) {
        //Ornek 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz.
        for (int i = 40; i>22  ; i--) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //Ornek 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz.
        for (int i = 18; i <57 ; i++) {
            if (i%2 !=0){
                System.out.print(i+" ");
            }
        }



    }
}
