package by.academy.homework3;

import by.academy.homework3.products.Product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

import static by.academy.homework3.Container.products;

public class Deal {
    private User seller;
    private User buyer;
    private Product[] product;
    private LocalDate dealDate = LocalDate.now();
    private LocalDate deadLine = LocalDate.now().plusDays(10);

    public Deal(User seller, User buyer, Product[] product, LocalDate dealDate, LocalDate deadLine) {
        this.seller = seller;
        this.buyer = buyer;
        this.product = product;
        this.dealDate = dealDate;
        this.deadLine = deadLine;
    }

    public Deal() {
        super();
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

    private void transferMoney(User seller, User buyer) {
        buyer.setMoney(buyer.getMoney() - calculateFullPrice());
        seller.setMoney(seller.getMoney() + calculateFullPrice());
    }

    void printBill() {
        System.out.println(dealDate.getDayOfMonth() + "\n" + dealDate.getMonth() + "\n" + dealDate.getYear());
        System.out.println("Стоимость покупок");
        for (Product p : products) {
            if (p == null) {
                continue;
            }
            System.out.println(p + " стоимость со скидкой " + p.calculatePriceWithDiscount());
        }
        System.out.println("К оплате " + calculateFullPrice());
        System.out.println("Дата заказа " + dealDate);

    }

    public double calculateFullPrice() {
        if (products == null) {
            return 0;
        }
        double result = 0;
        for (Product p : products) {
            if (p == null) {
                continue;
            }
            result += p.calculatePriceWithDiscount();
        }
        return result;
    }

    public void dealDone() {
        double price = calculateFullPrice();
        if (buyer.hasEnoughMoney(calculateFullPrice())) {
            transferMoney(seller, buyer);
            System.out.println("Оплачено " + calculateFullPrice());
            System.out.println("Оплата прошла успешно");
            System.out.println("Дата оплаты " + deadLine);
            System.out.println("Сделка завершена. Приходите еще!");
            System.out.println("\nДля налоговой: ");
            System.out.println("Продавец " + seller);
            System.out.println("Покупатель " + buyer);
        } else {
            System.out.println("У покупателя нет столько денег. Не хватает " + (price - buyer.getMoney()));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        return Objects.equals(getSeller(), deal.getSeller()) && Objects.equals(getBuyer(), deal.getBuyer()) && Arrays.equals(getProduct(), deal.getProduct()) && Objects.equals(dealDate, deal.dealDate) && Objects.equals(deadLine, deal.deadLine);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSeller(), getBuyer(), dealDate, deadLine);
        result = 31 * result + Arrays.hashCode(getProduct());
        return result;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "seller=" + seller +
                ", buyer=" + buyer +
                ", product=" + Arrays.toString(product) +
                ", dealDate=" + dealDate +
                ", deadLine=" + deadLine +
                '}';
    }

}