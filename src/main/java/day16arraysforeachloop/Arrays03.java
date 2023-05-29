package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        // Ornek-1: int array olusturunuz, icine 6 tane eleman yarlestirniz.
        // En kucugu ile en buyugunun toplamini yazdiriniz.

        int ages [] = new int[6];

        ages [0] =20;
        ages [1] =32;
        ages [2] =21;
        ages [3] =45;
        ages [4] =19;
        ages [5] =53;
        System.out.println(Arrays.toString(ages));

        //1.yol ==> sort() metotu array'de ki elemanlari kucukten buyuge dogru siralar.
        Arrays.sort(ages);
        System.out.println("Ornek-1.1: "+ (ages [0] + ages[ages.length-1]));//72

        //2.yol ==>
        int min = ages[0];
        int max = ages[0];

        for (int w: ages ) {

            min= Math.min(min,w);// Math.min/max ile variable icinde ki en kucuk/buyuk sayi secilir.
            max= Math.max(max,w);// int ise int-double ise double dondurmesi icin ilgili data type secilir.
        }
        System.out.println("Ornek-1.2: "+ (max+min));//72

        // Ornek-2: String bir Array olusturunuz 6 eleman ekleyinz.
        // Yellow, dan onceki elemani yazdiirniz.

        String colors [] = new String[6];

        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";
        System.out.println(Arrays.toString(colors));

        for (String w: colors) {
            if (w.equals("Yellow")){
                break;
            }
            System.out.println("Ornek-2: "+ w);
        }

    }
}
