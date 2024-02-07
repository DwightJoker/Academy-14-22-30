package by.academy.lessons16to30.lesson21.classwork;

public class Tiger extends Cat{

    private Integer paws;
    protected String color;
    public String hair;


    public Tiger(String country, Integer age, String name, Integer paws, String color, String hair) {
        super(country, age, name);
        this.paws = paws;
        this.color = color;
        this.hair = hair;
    }

    public static void methodTigerOne() {
        System.out.println("methodTigerOne");
    }
    private static void run() {
        System.out.println("run");
    }
    protected static void methodTigerThree() {
        System.out.println("methodTigerThree");
    }

    @Override
    public String toString() {
        return "Tiger:" + name +
                " paws:" + paws +
                " color:" + color +
                " hair:" + hair +
                " age:" + age;
    }
}
