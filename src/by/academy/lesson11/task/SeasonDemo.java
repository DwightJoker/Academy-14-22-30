package by.academy.lesson11.task;

public class SeasonDemo {
    public static void main(String[] args) {
        for (Season seasons : Season.values()) {
            printInfo(seasons);
        }
        System.out.print("Любимое время года: ");
        printInfo(Season.valueOf("SUMMER"));
    }

    public static void printInfo(Season seasons) {
        System.out.printf(String.valueOf(seasons));
        seasons.getDescription();
    }
}
