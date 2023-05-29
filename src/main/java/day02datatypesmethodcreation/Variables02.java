package day02datatypesmethodcreation;
public class Variables02 {
    public static void main(String[] args) {
    /*
    Java da temelde 2 tip data vardir
    1) primitive data type:
        char, boolean, byte, short, int, long, float, double
    2) non-primitive:
     */
    /*
    Not 1: primitive data type'larini java olusturmustur, biz olusturamayiz.
    Not 2: primitive data type'lari sadece kucuk harflerle yazilir.
    Not 3: primitive data'lar data type'larina gore memory'de farkli farkli yer kaplar.
    Not 4: primitive data'lar iclerinde SADECE sizin atadiginiz degeri barindirir.

    */
    /*
    Non-primitive data types
    Ornek=> String .....
    * * * Uretilen her bir class ayni zamanda bir non-primitive data type'dir.
    Bu yuzden non-primitive data type'lar sinirsiz sayidadir denilebilir.
    * * * non-primitive data type'larin isimleri buyuk harflerle baslar.
    * * * non-primitive'ler icin Java memory de buyuklugune gore yer acar.
        */

    //Ornek: Ulke ismi icin bir variable olusturun ve ekrana yazdirin.
        String ulkeIsmi = "Turkiye";
        System.out.println(ulkeIsmi);

        /*
        Interview sorusu: "primitive" ve "non-primitive" data type'lari arasinda ki fark nedir?
                1- "primitive" ler sadece bizim atadigimiz degeri icerir.
                   "non-primitive" ler bizim atadigimiz degeri ve method'lari icerir.
                2- "primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar.
                3- "primitive" leri JAVA uretmistir ve 8 adettir.
                   "non-primitve" leri java ve developerlar uretebilir, sinirsizdir.
                4- "primitive" ler memory'de data type'larina gore sabit alan kullanirlar.
                   "non-primitive"ler icin java memory'de buyuklugune gore yer kaplar (degiskendir).
         */



    }//main
}//class
