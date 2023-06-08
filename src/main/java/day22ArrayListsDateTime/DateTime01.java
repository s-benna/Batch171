package day22ArrayListsDateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    public static void main(String[] args) {

        // icinde bulundugumuz zaman diliminde nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate); //2023-06-07

        //Tarihten istediigmiz zaman gitme
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue); //6

        //Tarihten yili nasil alabilirim
        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue); //2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue); //7

        // Month bi enum'dir-
        // Enum java'da sabit degerler (Ay isimleri, gun isimleri, ulke isimleri) kullanmak icin kullanilir.
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);//JUNE

        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//wednesday

        // Ileri tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(3));//2026-08-12

        // Gecmise nasil gidilir?
        System.out.println(myCurrentDate.minusYears(20));//2003-06-07

        LocalDate date1 = LocalDate.of(1999,8,10);
        LocalDate date2 = LocalDate.of(1980,8,10);
        System.out.println(date1);

        // Bir tarihin bir tarihten sonra mi once mi oldugunu kontrol etme
        boolean r1 = date1.isAfter(date2);
        System.out.println(r1); //true

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2); //false

        boolean r3 = date1.isEqual(date2);
        System.out.println(r3); //false


























    }
}
