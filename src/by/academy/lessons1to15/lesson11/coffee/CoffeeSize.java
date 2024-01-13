package by.academy.lessons1to15.lesson11.coffee;

public enum CoffeeSize implements Coffee {
    BIG(350), HUGE(500), OVERWHELMING(750);

    final int ml;
    String producer;

    CoffeeSize(int ml) {
        this.ml = ml;
    }


    @Override
    public void buy() {
        System.out.println("buy coffee");
    }


}