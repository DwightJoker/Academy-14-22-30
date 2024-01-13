package by.academy.lessons1to15.lesson13;

public class Anon implements Printable{

    public static void main(String[] args) {


        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Print this aaa");
            }

        };
        printable.print();
    }


    @Override
    public void print() {

    }
}
