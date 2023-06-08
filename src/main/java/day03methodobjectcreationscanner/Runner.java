package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        //Object nasil olusturulur

        //new keyword'u sifirdan yeni bir object olusturmak icin kullanilir
        //Constructor java'da objeleri olusturmak icin kullanilan ozel bir method'tur.
        //Class ismi  + Object ismi + Assignment Operator + "new" keywordu + Constructor
            Car         myCar           =                   new                 Car();
        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student aliCan = new Student();
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.study();
        aliCan.feed();

        /*    Homework
        Icinde isim ve yas variable'lari ile teach methoduda bulunan bir teacher
        objesi olusturun ve ve obje uzerinde bu ozellikleri kullanin
        */
    }//main
}//class
