package by.academy.homework3.err;

import by.academy.homework3.validation.DateValidator;

import java.time.LocalDate;

public class demo {

    public static void main(String[] args) {


        LocalDate localDate1 = DateValidator.getDate("22/11/2022");
        if (localDate1 != null){
            System.out.println(localDate1);
            System.out.println(localDate1.getDayOfMonth() + "\n" + localDate1.getMonth().toString() + '\n' + localDate1.getYear());
        }else{
            System.out.println("Error");
        }

        DateValidator v = new DateValidator();
        System.out.println(v.gPV("dd/MM/yyyy"));
        System.out.println(v.gPV("22/10/2022"));
        System.out.println(v.gPV("dd-MM-yyyy"));
        System.out.println(v.gPV("22-10-2022"));
    }
}
