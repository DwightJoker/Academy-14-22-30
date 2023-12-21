package by.academy.lesson8.deal;

import java.time.LocalDate;
import java.util.Objects;

public class User {

    protected String name;
    protected double money;
    protected LocalDate dateOfBirth;


    public User(String name, double money, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.money = money;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean hasEnoughMoney(double price) {
        return money >= price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.getMoney(), getMoney()) == 0 && Objects.equals(getName(), user.getName()) && Objects.equals(getDateOfBirth(), user.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMoney(), getDateOfBirth());
    }
}
