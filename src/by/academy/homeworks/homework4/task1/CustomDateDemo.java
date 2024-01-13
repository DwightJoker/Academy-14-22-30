package by.academy.homeworks.homework4.task1;

import java.util.Scanner;

import static by.academy.homeworks.homework4.task1.CustomDate.daysInPeriod;

public class CustomDateDemo {

    private static final DateDashValidator DATE_DASH_VALIDATOR = new DateDashValidator();
    private static final Scanner dateScan = new Scanner(System.in);

    public static void main(String[] args) {
        CustomDate customDate1 = dateValidation(dateScan);
        customDate1.printDayNumberOfWeek();
        customDate1.printDayNameOfWeek();
        System.out.println("Is leap year: " + customDate1.isLeapYear());
        System.out.println('\n');

        CustomDate customDate2 = dateValidation(dateScan);
        customDate2.printDayNumberOfWeek();
        customDate2.printDayNameOfWeek();
        System.out.println("Is leap year: " + customDate2.isLeapYear());
        System.out.println('\n');

        daysInPeriod(customDate1, customDate2);
    }

    private static CustomDate dateValidation(Scanner dateScan) {
        for (; ; ) {
            System.out.print("Enter date: ");
            String strDate = CustomDateDemo.dateScan.next();
            if (DATE_DASH_VALIDATOR.validation(strDate)) {
                CustomDate customDate = new CustomDate(strDate);
                customDate.daysOfWeek();
                System.out.println("Year : " + customDate.getYear().value + '\n' + "Month : " + customDate.getMonth().value + '\n' + "Day : " + customDate.getDay().value);
                return customDate;
            } else {
                System.out.println("Incorrect date. Try again later.");
            }
        }
    }

}
