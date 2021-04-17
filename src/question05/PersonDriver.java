/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

import java.util.Date;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question number: 01   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");

        Person p = new Person("chandra", "1215 west 16th street", 660528138,
                "tatachandrabhanu@gmail.com");

        Student s = new Student(73.6, "jaya krishna", "1-88 vedullapalli", 944041283,
                "chandrabhanu3811@gmail.com");
        Date d = new Date();

        Employee e = new Employee("ibm", 35000, d, "srikanth", "11-98 bapatla",
                646485959, "acsid@gmail.com");

        Faculty f = new Faculty(8, 4, "colden hall", 70000, d, "suresh", "33-8748 chirala",
                874799935, "officecolden@gmail.com");

        Staff st = new Staff("data analyst", "new york", 56685, d, "bhanu",
                "44-564 maryville", 343465557, "maryville35@gmail.com");
        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);

        // TODO code application logic here
    }

}
