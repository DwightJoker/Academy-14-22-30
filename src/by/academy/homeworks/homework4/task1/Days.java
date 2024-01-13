package by.academy.homeworks.homework4.task1;

public enum Days {

    MONDAY("MONDAY", 1), TUESDAY("TUESDAY", 2),
    WEDNESDAY("WEDNESDAY", 3), THURSDAY("THURSDAY", 4),
    FRIDAY("FRIDAY", 5), SATURDAY("SATURDAY", 6),
    SUNDAY("SUNDAY", 7);

    public final String name;
    public final int dayNumber;

    Days(String name, int dayNumber) {
        this.name = name;
        this.dayNumber = dayNumber;
    }
}

