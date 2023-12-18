package by.academy.lesson9;

public class Animal {

    String name;
    String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        System.out.println("Animal");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
