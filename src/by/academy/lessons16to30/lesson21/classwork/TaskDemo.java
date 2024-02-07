package by.academy.lessons16to30.lesson21.classwork;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TaskDemo {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        Tiger t1 = new Tiger("123", 444, "Bars", 4, "red", "long");
        Class<? extends Tiger> t1Class = t1.getClass();
        Cat c1 = new Cat("poland", 4, "Igor");
        Class<? extends Cat> c1Class = c1.getClass();

        Field[] tigar = t1Class.getDeclaredFields();
        for (Field field : tigar) {
            System.out.println(field + "\n");
        }

        Field colorField = t1Class.getDeclaredField("color");
        colorField.setAccessible(true);
        System.out.println("Before change:" + colorField.get(t1));
        colorField.set(t1, "blue");
        System.out.println(t1);

        Field[] cat = c1Class.getDeclaredFields();
        for (Field field : cat) {
            System.out.println(field + "\n");

        }

        Field countryField = c1Class.getDeclaredField("country");
        countryField.setAccessible(true);

        System.out.println("Before change:" + countryField.get(c1));
        countryField.set(c1, "belarus");
        System.out.println(c1);

        Method runMethod = t1Class.getDeclaredMethod("run");
        System.out.println(runMethod);
        runMethod.setAccessible(true);
        runMethod.invoke(t1,"stop");
        System.out.println(runMethod);




    }
}
