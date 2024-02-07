package by.academy.homeworks.homework7.task1;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.*;

import static java.lang.Math.PI;

public class Task1 {

    public static void main(String[] args)  throws IllegalStateException{

//Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100
        List<Long> longList = generateLongList();
//Full to List
        System.out.println(longList.stream().distinct()
         .map(i -> i * PI - 20)
         .filter(i -> i < 100)
         .sorted((o1, o2) -> (int) (o1 - o2))
         .skip(3)
         .collect(Collectors.toList()));

//Full to Map
//         System.out.println(longList.stream().distinct()
//                 .map(i -> i * PI - 20)
//                 .filter(i -> i < 100)
//                 .sorted((o1, o2) -> (int) (o1 - o2))
//                 .skip(3).collect(Collectors.toMap(Double::longValue,  longValue -> "Number: " + longValue)));

        System.out.println(longList.stream().distinct()
                .map(i -> i * PI - 20)
                .filter(i -> i < 100)
                .sorted((o1, o2) -> (int) (o1 - o2))
                .skip(3).collect(Collectors.toMap(d -> d.longValue(), d -> " Number: " + d.longValue())));
    }

    private static List<Long> generateLongList() {
        return new Random().longs(100, 0, 100).
                boxed().collect(Collectors.toList());
    }
}

