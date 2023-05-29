package day14loops;

public class Loops02 {
    public static void main(String[] args) {

        //Ornek-1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //        5+6+7+8==>26


        int sum = 0;
        for ( int i = 5; i<9; i++){
            sum = sum+i;
        }
        System.out.println("Ornek-1: " + sum);

        //Ornek-2: 7'den 9'e kadar tamsayilarin carpimini veren kodu yaziniz.
        //         7*8*9==>504

        int multiply = 1;
        for (int a =7 ; a<10; a++ ){
            multiply = multiply*a;
        }
        System.out.println("Ornek-2: " + multiply);

        //Ornek-3: Verilen bir tamsayinin rakamlari toplamini bulan kodu yaziniz.
        //578 ==> 5+7+8=20

        int toplam=0;
        for ( int i = 578; i>0; i=i/10){
            toplam=toplam +i%10;
        }
        System.out.println("Ornek-3: " + toplam);



















    }
}
