package by.academy.lessons1to15.lesson12;

public class Calc {

    public static <X extends Number,Y extends Number> double sum(X x, Y y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static void main(String[] args) {

        double result = Calc.sum(5, 5.5);
        System.out.println(result);
    }

}
