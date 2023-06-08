package day14loops;

public class day14Tekrar {
    public static void main(String[] args) {
        String t = "Java";
        String ters = "";
                     //t.length()-1 ile bir nevi 0 demis olduk
        for (int i = t.length()-1; i >=0; i--) { // i 0'a esit olana kadar azalt demek tum harfleri al demek
            ters = ters+ t.substring(i,i+1); // belli bir araligi istiyoruz. yukarida t stringini yeniden duzenledik ve
                                             // i demek 0 demekti, 0. index'ten i+1. index'e kadar al dedik.
        }
        System.out.println(ters);

    }
}
