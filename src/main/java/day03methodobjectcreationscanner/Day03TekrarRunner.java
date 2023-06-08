package day03methodobjectcreationscanner;

import java.util.Scanner;

public class Day03TekrarRunner {
    public static void main(String[] args) {
        CarTekrar arabam = new CarTekrar();
        System.out.println("Fiyat: "+arabam.price);
        System.out.println("Araba marka: " + arabam.model);

        arabam.bevegelse(); // Burada Car class'inda yazdirma islemi yaptidigimiz icin sadece cagiriyoruz.
        arabam.stop();      // Yazdirma islemini otomatik yapiyor.

                            // Method aktif bir ozelliktir.

    }
}
