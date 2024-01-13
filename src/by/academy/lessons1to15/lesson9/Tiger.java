package by.academy.lessons1to15.lesson9;

public class Tiger extends Cat{

    int age;

    public Tiger(String name, String type, int weight, String family, int age) {
        super(name, type, weight, family);
        this.age = age;
        System.out.println("Tigar");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
}
