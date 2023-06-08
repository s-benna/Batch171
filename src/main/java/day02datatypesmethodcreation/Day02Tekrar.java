package day02datatypesmethodcreation;

public  class Day02Tekrar {
    public static void main(String[] args) {

        // Ornek 1: Toplama islemi yapan bir method olusturunuz.
        int sonuc = toplaIslemi(4,5);
        System.out.println(sonuc);

        // Ornek 2: 2 sayiyi carpma islemi yapan bir method olusturunuz.
        int carpmaSonuc = carpmaIslemi(10,23);
        System.out.println(carpmaSonuc);

        // Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonuncu sayi ile toplayan methodu olusturunuz ve yazdiriniz.
        int ornek3 = islem(23,12,7);
        System.out.println(ornek3);
        // Ornek 4: Dikdortgenin alanini hesaplayan methodu olusturun ve kullanin.
        int ornek4 = dikdortgenCevre(12,7);
        System.out.println(ornek4);
        // Ornek 5: Dikdortgenin cevresini hesaplayan methodu olusturun ve kullanin.
        int ornek5 = dikdortgenAlan(13,71);
        System.out.println(ornek5);

    }//main
    public static int toplaIslemi (int a, int b){
        return a+b;
    }
    public static int carpmaIslemi(int x, int y){
        return x*y;
    }
    public static int islem(int k, int t, int z){
        return k*t+z;
    }
    public static int dikdortgenCevre(int kisaKenar,int uzunKenar){
        return 2*(kisaKenar+uzunKenar);
    }
    public static int dikdortgenAlan(int kisa, int uzun){
        return kisa*uzun;
    }

}//class
