package by.academy.lessons1to15.lesson9.classA;

public class InheritedClassInA extends ClassInA{

    public void someMethod() {
        System.out.println(super.protectedVariable);
        System.out.println(super.publicVariable);
        System.out.println(super.variable);
        //System.out.println(super.privatVariable);
    }
}
