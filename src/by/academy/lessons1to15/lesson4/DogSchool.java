package by.academy.lessons1to15.lesson4;

import by.academy.lessons1to15.lesson2.Dog;

public class DogSchool {
    public static void main(String[] args) {

        Dog c = new Dog("c", 1);

                while (c.getAge() < 7) {
                    c.grow();
        }
        System.out.println(c.getNickname() + "пора в школу");
    }

}
