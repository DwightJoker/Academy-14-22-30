package by.academy.lesson2DZ.student;

import by.academy.lesson2DZ.student.Student;

public class StudentApp {
    public static void main(String[] args) {
       Student Oleg = new Student();
       Oleg.setName("Oleg");
       Oleg.setSurname("Ivanov");
       Oleg.setAge(25);
       Oleg.setId(2345673);
        System.out.println(Oleg);

        Oleg.getStudentInfo();
    }

}
