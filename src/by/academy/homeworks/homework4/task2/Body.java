package by.academy.homeworks.homework4.task2;


public class Body {
    private final Heart heart = new Heart();
    private final Lungs lungs = new Lungs();


    public void live() {
        heart.live();
        lungs.live();
        System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea. \n" +
                "And I believe that you are free, and life has only begun.");
    }

    public static class Heart {
        //static для работы h1.live();
        public void live() {
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                if (i % 100 == 0) {
                    System.out.println("Knock-knock-knockin' on heaven's door" + " " + i);
                }
            }
        }

    }

    public static class Lungs {
        //static для работы l1.live();
        public void live() {
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                if (i % 50 == 0) {
                    System.out.println("breathe in" + " " + i);
                }
                if (i % 100 == 0) {
                    System.out.println("breathe out" + " " + i);
                }
            }
        }

    }

}
