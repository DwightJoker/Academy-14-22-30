package by.academy.homeworks.homework5.task6;

public class TryCatch {

    public static void main(String[] args) {

        int[] array = new int[]{0,1,2,3,4,5,6,50};
        System.out.println("New Array Created");
        System.out.println("Last number in Array is: " + array[7]);

        try {
            array[8] = 22;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is to small, expand the array");
            System.out.println("Error: " + e);
        }
    }
}
