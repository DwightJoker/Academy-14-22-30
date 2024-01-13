package by.academy.homeworks.homework4.task1;

import java.time.LocalDate;

public class CustomDate {

    public Year year;
    public Month month;
    public Day day;
    static Days dayOfWeek;

    public CustomDate(String strDate) {
        this.year = new Year(Integer.parseInt(strDate.substring(6)));
        this.month = new Month(Integer.parseInt(strDate.substring(3, 5)));
        this.day = new Day(Integer.parseInt(strDate.substring(0, 2)));
    }

    public class Year {
        int value;

        public Year(int year) {
            this.value = year;
        }
    }

    public class Month {
        int value;
        String name;


        public Month(int month) {
            this.value = month;
        }
    }

    public class Day {
        int value;
        String name;

        public Day(int day) {
            this.value = day;
        }
    }

    public void daysOfWeek() {
        switch (this.toLocalDate().getDayOfWeek().toString()) {
            case "MONDAY":
                dayOfWeek = Days.MONDAY;
                break;
            case "TUESDAY":
                dayOfWeek = Days.TUESDAY;
                break;
            case "WEDNESDAY":
                dayOfWeek = Days.WEDNESDAY;
                break;
            case "THURSDAY":
                dayOfWeek = Days.THURSDAY;
                break;
            case "FRIDAY":
                dayOfWeek = Days.FRIDAY;
                break;
            case "SATURDAY":
                dayOfWeek = Days.SATURDAY;
                break;
            case "SUNDAY":
                dayOfWeek = Days.SUNDAY;
                break;
        }
    }
    public LocalDate toLocalDate() {
        return LocalDate.of(this.year.value, this.month.value, this.day.value);
    }

    public static void daysInPeriod(CustomDate end, CustomDate start) {
        LocalDate endDate = end.toLocalDate();
        LocalDate startDate = start.toLocalDate();
        int period = (int) Math.abs((endDate.toEpochDay()) - startDate.toEpochDay());
        System.out.println("Days between 1 date and 2 date: " + period);
    }

    public void printDayNameOfWeek() {
//    System.out.println("Day of week in list: " + this.dayOfWeek.dayNumber);
        System.out.println("Day of week in list: " + this.dayOfWeek.name);
    }

    public boolean isLeapYear() {
        return toLocalDate().isLeapYear();
    }
    public void printDayNumberOfWeek() {
        System.out.println("Day of week: " + this.dayOfWeek.dayNumber);
    }

    public Year getYear() {
        return year;
    }

    public Month getMonth() {
        return month;
    }

    public Day getDay() {
        return day;
    }
}

