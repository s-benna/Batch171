package day05concatinationoperatortypecasting;

public class AsciiValues {
    public static void main(String[] args) {
    /*
        Java'da her karekterin sayisal bir degeri vardir, bu degerler ASCII degerler olarak adlandirilir.
        ASCII tablosundan bu degerlere bakilir.
    */
        //Not: Herhangi bir character'in ASCII degerini bulmak icin o karekteri "int" data type' inda bir variable' in icine koyunuz.
        char ch = 'A';
        System.out.println(ch);//A
        int k = 'A';
        System.out.println(k);//65

        int unlem = '!';
        System.out.println(unlem);//33
        int deneme1 = 'ø';
        System.out.println(deneme1);//248

        char c1 = 'a';
        char c2 = '?';
        System.out.println(c1+c2);//ASCII degerleri toplamini alir.==>97+63==160
        // Java'da char'lari matematiksel islemlerde kullanirsaniz, Java o char'larin ASCII degerlerini kullanir.


    }
}
