package day02datatypesmethodcreation;

public class homework02 {
    public static void main(String[] args) {


        //1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullaniniz
        int alanSonucu=alanHesapla(56,32);
        System.out.println(alanSonucu);

        //2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
        int cevreSonucu=cevreHesapla(44,30);
        System.out.println(cevreSonucu);

    }

    public static int  alanHesapla(int kenar1,int kenar2){
        return kenar1*kenar2;
    }
    public static int cevreHesapla(int kenar1,int kenar2){
        return 2*(kenar1+kenar2);
    }

}
