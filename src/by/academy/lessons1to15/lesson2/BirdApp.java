package by.academy.lessons1to15.lesson2;

public class BirdApp {

    public static void main(String[] args) {

        Bird golub = new Bird();

        System.out.println(golub.size);
        golub.size = "mid";

        Bird vorobei = new Bird();
        vorobei.size = "big";
        String vorobeiSize = vorobei.getSize();
        System.out.println(vorobeiSize);
        vorobei.setType("wild");
        String vorobeiType = vorobei.getType();
        System.out.println(vorobeiType);
    }
}
