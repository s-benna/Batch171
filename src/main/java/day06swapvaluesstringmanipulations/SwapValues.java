package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        /*        Swap: Yer degistirmek.
                  1.Kap: Patates, 2.Kap: Domates ==> swap ==> 1.Kap:Domates 2.Kap:Patates
        */
        int a = 12;
        int b= 5; //Swapden sonra a=5, b=12
        int temp =0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //1.adim
        temp=a;
        //2.adim
        a=b;
        //3.adim
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.Yol
        int elma = 12;
        int armut=5;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma=elma+armut;
        armut=elma-armut;
        elma=elma-armut;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);


    }
}
