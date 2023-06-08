package day20statickeywordconstructors;

import static day20statickeywordconstructors.Student.stdName;

public class StdRunner {
    public static void main(String[] args) {
       // stdName static olduugndan ona ulasmak icin object olusturmadm
       // sadece class ismini kullanmak yeterlidir.

        System.out.println(stdName);

        // age non-static oldugun ona ulasmak icin object olusturmaliyiz
        Student std1 = new Student();
        System.out.println(std1.age);

        Student std2 = new Student();
        Student.staciMethod(); // Ben static methodum.
        std2.nonStaticMethod();// Ben static method degilim.

        // object uzerinden de static class member'lara ulasilabilir
        System.out.println(std1.stdName);

    }

}
