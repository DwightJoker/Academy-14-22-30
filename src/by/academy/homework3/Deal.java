package by.academy.homework3;
import by.academy.homework3.products.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Deal {
    private User seller;
    private User buyer;
    private Product[] product;
    private LocalDateTime dateTime;

    public Deal(User seller, User buyer, Product[] product, LocalDateTime dateTime) {
        this.seller = seller;
        this.buyer = buyer;
        this.product = product;
        this.dateTime = dateTime;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDate(LocalDateTime date) {
        this.dateTime = dateTime;
    }
    private void transferMoney(User seller, User buyer) {

    }
    private void printBill() {
    }

    public double calculateFullPrice() {
        if (product == null) {
            return 0;
        }
        double result = 0;
        for (Product p : product) {
            result += p.calculatePriceWithDiscount();
        }
        return result;
    }

    public void submit() {
        double price = calculateFullPrice();
        if (buyer.hasEnoughMoney(price)) {
            printBill();
            transferMoney(seller, buyer);
            setDate(LocalDateTime.now());
            System.out.println("Сделка совершена");
        } else {
            System.out.println("У покупателя нет столько денег: " + price);
        }
    }
    public void deadlineDate(){
        LocalDate today = LocalDate.now();
        LocalDate deadline = today.plusDays(10);
        System.out.println("Дедлайн " + deadline);

    }

}

