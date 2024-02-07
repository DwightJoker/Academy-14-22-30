package by.academy.homeworks.homework7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task2 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        User u1 = new User("Name", "Surname", "22.02.2002","login", "password", "e@mail");
        u1.printUsersInfo();
//        Person p1 = new Person("123", "1234");
//        Class<? extends Person> p1Class = p1.getClass();

        Class<? extends User> u1Class = u1.getClass();

        //getMethod("name")
        Method t1 = u1Class.getMethod("printUsersInfo");
        System.out.println(t1);
        System.out.println(t1.getName());
        System.out.println();

        //getMethods()
        Method[] t2 = u1Class.getMethods();
        System.out.println(t2);
        System.out.println();

        //getField("name")
//        try {
//            Field userField1 = u1Class.getField("login");
//            userField1.setAccessible(true);
//            Field userField2 = u1Class.getField("password");
//            userField2.setAccessible(true);
//            Field userField3 = u1Class.getField("email");
//            userField3.setAccessible(true);
//            Field personField1 = u1Class.getField("firstName");
//            personField1.setAccessible(true);
//            Field personField2 = u1Class.getField("lastName");
//            personField2.setAccessible(true);
//            Field personField3 = u1Class.getField("dateOfBirth");
//            personField3.setAccessible(true);
//            System.out.println(userField1.get(u1) + "\n" + userField2.get(u1) + "\n" + userField3.get(u1) + "\n" + personField1.get(u1) + "\n" + personField2.get(u1) + "\n" + personField3.get(u1));
//        } catch (IllegalAccessException | NoSuchFieldException e) {
//            e.printStackTrace();
//        }

//        //getFields()
//        Field[] allFields = u1Class.getFields();
//        for (Field field : allFields) {
//            field.setAccessible(true);
//            System.out.println(field);
//        }

        //getDeclaredMethod("name")
        Method t5 = u1Class.getDeclaredMethod("printUsersInfo");
        System.out.println(t5);
        System.out.println(t5.getName());
        System.out.println();

        //getDeclaredMethods()
        Method[] t6 = u1Class.getDeclaredMethods();
        System.out.println(t6);
        System.out.println();

        //getDeclaredField("name")
//        try {
//            Field userDeclaredField1 = u1Class.getDeclaredField("login");
//            userDeclaredField1.setAccessible(true);
//            System.out.println("Before change: " + userDeclaredField1.get(u1));
//            userDeclaredField1.set(u1, "oleg");
//            System.out.println("After change: " + u1.getLogin());
//
//            Field userDeclaredField2 = u1Class.getDeclaredField("password");
//            userDeclaredField2.setAccessible(true);
//            System.out.println("Before change: " + userDeclaredField2.get(u1));
//            userDeclaredField2.set(u1, "golen");
//            System.out.println("After change: " + u1.getPassword());
//
//            Field userDeclaredField3 = u1Class.getDeclaredField("email");
//            userDeclaredField3.setAccessible(true);
//            System.out.println("Before change: " + userDeclaredField3.get(u1));
//            userDeclaredField3.set(u1, "oleg@mail.ru");
//            System.out.println("After change: " + u1.getEmail());
//
//            Field personDeclaredField1 = u1Class.getField("firstName");
//            personDeclaredField1.setAccessible(true);
//            System.out.println("Before change: " + personDeclaredField1.get(u1));
//            personDeclaredField1.set(u1, "oleg");
//            System.out.println("After change: " + u1.getFirstName());
//
//            Field personDeclaredField2 = u1Class.getField("lastName");
//            personDeclaredField2.setAccessible(true);
//            System.out.println("Before change: " + personDeclaredField1.get(u1));
//            personDeclaredField1.set(u1, "Ogorod");
//            System.out.println("After change: " + u1.getLastName());
//
//            Field personDeclaredField3 = u1Class.getField("dateOfBirth");
//            personDeclaredField3.setAccessible(true);
//            System.out.println("Before change: " + personDeclaredField3.get(u1));
//            personDeclaredField3.set(u1, "11.11.2011");
//            System.out.println("After change: " + u1.getDateOfBirth());
//
//            //System.out.println(userDeclaredField1.get(u1) + "\n" + userDeclaredField2.get(u1) + "\n" + userDeclaredField3.get(u1) + "\n" + personDeclaredField1.get(u1) + "\n" + personDeclaredField2.get(u1) + "\n" + personDeclaredField3.get(u1));
//        } catch (IllegalAccessException | NoSuchFieldException e) {
//            e.printStackTrace();
//        }

        //getDeclaredFields()
//        Field[] allDeclaredFields = u1Class.getDeclaredFields();
//        for (Field field : allDeclaredFields) {
//            field.setAccessible(true);
//            System.out.println(field);
//        }
    }
}
//Посмотреть разницу - разница в доступе
// Вызвать toString через invoke.