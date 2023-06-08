package day07StringManipulations;

import java.util.Scanner;

public class Day07Tekrar {
    public static void main(String[] args) {
        String t = "Ali 32 yasinda ..!";
        String yeniT = t.replaceAll("[0-9]","*");
        System.out.println(yeniT);

        String yeniT2 = t.replace('i','!');
        System.out.println(yeniT2);

        Scanner pass = new Scanner(System.in);
        System.out.println("Parola girin");
        String parola = pass.nextLine();

        boolean ilkSart = parola.length()>9;
        boolean ikinciSart = !parola.contains(" ");
        boolean ucuncuSart= parola.replaceAll("[^A-Z]","").length()>0;
        boolean dorduncuSart = parola.replaceAll("[^a-z]", "").length()>0;
        boolean sonSart = parola.replaceAll("[^0-9]","").length()>0;

        System.out.println("Paralo gecerli mi? = " +
                            (ilkSart && ikinciSart && ucuncuSart && dorduncuSart && sonSart));




    }

}
