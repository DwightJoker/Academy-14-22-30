package by.academy.lessons16to30.lesson21.classwork;

public class Cat {

    private String country;

    protected Integer age;

    public String name;

    public Cat() {
    }

    public Cat(String country, Integer age, String name) {
        this.country = country;
        this.age = age;
        this.name = name;
    }

    public static void methodCatOne() {
        System.out.println("methodCatOne");
    }
    private static void methodCatTwo() {
        System.out.println("methodCatTwo");
    }
    protected static void methodCatThree() {
        System.out.println("methodCatThree");
    }

    @Override
    public String toString() {
        return "Cat:" + name +
                " country:" + country +
                " age:" + age;
    }
}
