package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //NOT: JAva "pass by value" sayesinde variable'lerin orjinal degerini korur.
        int shirtPrice = 100;

        discount ("student",shirtPrice);

        //Java methoda gonderirken orjinal degeri degil, kopyasini gonderir ve degisen deger kopya deger olur.
        System.out.println(discount("student", shirtPrice));//90

        System.out.println(discount("veteran", shirtPrice));//80

        System.out.println(discount("senior", shirtPrice));//95

        System.out.println(shirtPrice);//100

        shirtPrice =discount("veteran", shirtPrice); // Veterandan gelene fiyati tekrar shirtPrice icine koyarak,
                                                          // veteran fiaytini guncel fiyat yapmis olduk. Ana parayi guncelledik
        System.out.println("shirtprice kampanya "+shirtPrice);


    }//main

    //Discount Metot olusturalim

    public static int discount(String type, int price){
        switch (type){
            case "student":
                price = price-10;
                break;

            case "veteran":
                price = price-20;
                break;

            case "senior":
                price = price-5;
                break;

            default:
                price=price;

        }
        return price;


    }//discount
        /*
            Pass By Value:
            1- Java "pass by value" kullanir.
            2- Yani; Java methodlarin orijinal degeri degistirmesine musade etmez.
            3- Java method'lari deger yollarken orijinal degerin kopyasini olusturur ve o kopyayi methoda yollar
            Method kopya deger uzerinde degisiklik yapar, boyleceorijinal deger korunmus olur.
            4- Java esnek bir dildir. Bakiniz ==> Satir-19

            Pass By Refence:
            1- Pass by Reference da method'a refence yollanir.
            2- Reference adres demektir. Adress yollaninca method adresi kullanrak orijinal degere ulasir ve degeri degistir.
            Bu yuzden "C#" gibi Pass by Refence kullanan dillerde method variable'in orijinal degerini degistirir.



        */






}//class