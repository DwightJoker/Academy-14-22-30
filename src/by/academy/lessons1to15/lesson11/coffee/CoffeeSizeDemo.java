package by.academy.lessons1to15.lesson11.coffee;

public class CoffeeSizeDemo {
    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.BIG;
        CoffeeSize coffeeSize2 = CoffeeSize.HUGE;
        CoffeeSize coffeeSize3 = CoffeeSize.OVERWHELMING;



        String string = "HUGE";
        CoffeeSize coffeeSize1 = CoffeeSize.valueOf(string);

        System.out.println(coffeeSize1);

        System.out.println(coffeeSize1.name());
        System.out.println(coffeeSize.name());


        coffeeSize1.buy();

        switch (coffeeSize1) {
            case BIG:
                System.out.println("size BIG");
                break;
            case HUGE:
                System.out.println("size Huge");
                break;
            case OVERWHELMING:
                System.out.println("size Over");
            default:
                System.out.println("no size");
        }

    }
}
