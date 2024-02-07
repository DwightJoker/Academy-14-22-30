package by.academy.lessons16to30.lesson20;

import java.util.function.Function;

public class LambdaTask7Demo {

    public static void main(String[] args) {

        //Function<Integer, String> f = i -> i > 0 ?"+" : i < 0 ? "-" : "0";

        Function<Integer, String> f = i -> {
            String res = "0";
            if(i>0){
                res = "+";
            } else if (i<0) {
                res = "-";
            }
            return res;
        };
        System.out.println(f.apply(-5));
        System.out.println(f.apply(5));
        System.out.println(f.apply(0));

    }
}
