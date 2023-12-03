package by.academy.lesson8.deal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {
    User seller;
    User buyer;
    Product[] product;
    LocalDate date;

    //boolean checkBuyerMoney();
    //void transferMoney(seller, buyer);
    //void printBill();
    //double calculateFullPrice();


    public Deal(User seller, User buyer, Product[] product, LocalDate date) {
        this.seller = seller;
        this.buyer = buyer;
        this.product = product;
        this.date = date;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        return Objects.equals(seller, deal.seller) && Objects.equals(buyer, deal.buyer) && Arrays.equals(product, deal.product) && Objects.equals(date, deal.date);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(seller, buyer, date);
        result = 31 * result + Arrays.hashCode(product);
        return result;
    }
    private void transferMoney(User seller, User buyer) {
    }
    public double calculateFullPrice() {
        if (product == null) {
            return 0;
        }
        double result = 0;
        for (Product p : product) {
            result += p.calculatePrice();
        }
        return result;
    }

    public void submit() {
        double price = calculateFullPrice();
        if (buyer.hasEnoughMoney(price)) {
            printBill();
            transferMoney(seller, buyer);
            setDate(LocalDate.now());
            System.out.println("Сделка совершена");
        } else {
            System.out.println("У покупателя нет столько денег: " + price);
        }
    }

    public void printBill() {


    }

}

