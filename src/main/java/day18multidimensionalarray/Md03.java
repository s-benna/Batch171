package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {
        // Iki boyutlu bir Array'i tek boyutlu bir Array'e ceviriniz.
        int numbers [][] = {{5,4},{2,3,2}};

        //1.Adim: iki boyutlu array'de kac tane eleman oldugunu bulan kodu yaziniz.
        int toplamElemanSayisi = 0;
        for (int [] w: numbers ) {
         toplamElemanSayisi = toplamElemanSayisi+w.length;
        }
        System.out.println(toplamElemanSayisi);//5

        //2.Adim: Tek boyutlu arrayi iki bouytlu arrayin eleman sayisini kullanarak olusturmaliyiz.
        int newArr [] = new int[toplamElemanSayisi];

        //3.Adim: iki boyutlu arraydeki elemanlari tek boyutlu array'e transfer etmeliyiz.

        int idx=0;
        for(int [] w : numbers){    //outer loop ile multidimensional arrayin int array olan elemanlarini tek tek aliriz

            for(int k :w){          //inner loop ile w sepetine koymus oldugumuz arrayin elemanlarini tek tek aliriz
                newArr[idx]=k;      //yeni olusturmus oldugumuz arraye index kullanarak atama yapiyoruz
                idx++;              //bir eleman ekledikten sonra bir yana kaydirma yapiyoruz
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
}
