package day18multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {
        String students [][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        // Ornek-1: Yukarida ki students array'in icindeki "m" olan isimleri console yazdiriniz.

        for (String[] w : students){    // 1 tane Array iceri alindi {"ALi","Kemal"}
            for (String k : w){         // Alinan Array kontrol ediliyor
                if (k.contains("m")){
                    System.out.println("Ornek-1: "+k);
                }
            }
        }

        // Ornek 2: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz.

        int nums[][]={{5,4},{2,3,2},{7}};
        int i = 1;
        for (int[] w : nums){
            for (int z : w ){
                i = i*z;
            }
        }
        System.out.println("Ornek 2: "+i);


    }
}
