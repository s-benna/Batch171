package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ulke adi giriniz..");

        String ulke = input.nextLine();

        switch (ulke.toLowerCase()){
            case "turkiye" :
                System.out.println("TR");
                break;
            case "norway" :
                System.out.println("NO");
                break;
            case "ingiltere":
                System.out.println("UK");
                break;
            case "almanya":
                System.out.println("DE");
                break;
            case "fransa":
                System.out.println("FR");
                break;
            case "ispanya":
                System.out.println("ES");
                break;
            case "belcika":
                System.out.println("BE");
                break;
            case "hollanda":
                System.out.println("NL");
                break;
            default:
                System.out.println("lutfen gecerli ulke girin");
        }

    }
}
