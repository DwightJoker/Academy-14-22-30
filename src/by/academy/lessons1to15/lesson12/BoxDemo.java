package by.academy.lessons1to15.lesson12;

import by.academy.lessons1to15.lesson8.deal.Product;
import by.academy.lessons1to15.lesson9.Cat;

public class BoxDemo {
    public static void main(String[] args) {
        CatBox catBox = new CatBox(new Cat());

        catBox.setCat(new Cat());
        System.out.println(catBox.getCat());

        Box<Cat> catBox1 = new Box<>(new Cat());
        catBox1.add(new Cat());
        catBox1.add(new Cat());
        catBox1.add(new Cat());
        catBox1.add(new Cat());
        catBox1.add(new Cat());
        catBox1.print();

        Box<Product> productBox = new Box<>(new Product());
        productBox.add(new Product());
        productBox.add(new Product());
        productBox.add(new Product());
        productBox.add(new Product());
        productBox.add(new Product());
        productBox.print();

    }
}
