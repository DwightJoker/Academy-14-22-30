package by.academy.lessons1to15.lesson2DZ.student;

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
