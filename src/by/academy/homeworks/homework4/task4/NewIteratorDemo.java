package by.academy.homeworks.homework4.task4;

public class NewIteratorDemo {

    public static void main(String[] args) {

        Integer[] arr = {11, 112, 3, 40};

        NewIterator<Integer> iterator = new NewIterator<>(arr);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
