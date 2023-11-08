package by.academy.lesson2DZ.student;

public class Student {

    String name;
    String surname;
    int age;
    long id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void getStudentInfo() {
        System.out.println(name + " " + surname + " " + age + " " + id);
        //String result = String.format("Student Name: %s, Student Surname: %s, Student Age: %d, Student ID: %d", name, surname, age, id);
        //System.out.println(result);
    }
}
