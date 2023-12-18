package by.academy.homework3;

import by.academy.homework3.products.Product;

public class Cart {

        public Product[] products;
        private int current;

        public void removeProductFromCart(int index){
            if (index < 0 || index >= current) {
                System.out.println("Введен неправильный индекс");
                return;
            }
            if (index != products.length -1) {
                System.arraycopy(products, index + 1, products, index, products.length - index - 1);
            }
            products[current-- - 1] = null;

        }

        public void increaseProductQuantity() {
            Product[] newProducts = new Product[products.length * 2 + 1];
            System.arraycopy(products, 0, newProducts, 0, products.length);
            products = newProducts;
        }

        public void add(Product product){
            if (products == null) {
                products = new Product[10];
                current = 0;
            }
            if (current >= products.length) {
                increaseProductQuantity();
            }

            products[current++] = product;

        }
        public void print() {
            for (int i = 0; i < current; i++) {
                System.out.println(products[i]);
            }
        }


}
