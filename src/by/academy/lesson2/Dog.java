package by.academy.lesson2;

public class Dog {
    String nickname;
    int age;
    String color;

    public Dog() {
        super();
    }
    public Dog(String nickname) {
        this.nickname = nickname;
    }

    public Dog(String nickname, int age, String color) {
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }

    public void eat() {
        System.out.println(color + "собака по кличке" + nickname + "Ест");
    }
    public void sleep() {
        System.out.println(color +  "собака по кличке"  + nickname + "Спит");
    }
    public void serve() {
        System.out.println(color + "собака по кличке" + nickname + "Служит");
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
