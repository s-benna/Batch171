package day22ArrayListsDateTime;

import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        // Ornek-1: Bir Listteki tekrarsiz elemanlari console yazdiran kodu yazin

        List<Double> price = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for (double w:price) {
            if (price.indexOf(w)== price.lastIndexOf(w)){
                System.out.println(w);
            }
        }

        // Ornek 2: Bir Listteki tekrarli eleman olup olmadiigni bulan kodu yaziniz.

        List<Integer> heights = List.of(3, 13, 3);
        int counter = 0;
        for ( int w : heights) {
            if (heights.indexOf(w) != heights.lastIndexOf(w)){
                counter++;
                break;
            }
        }
        if (counter==0){
            System.out.println("All elements are unique in the list");
        }else {
            System.out.println("At list one element is not unique in th list");
        }


























    }
}
