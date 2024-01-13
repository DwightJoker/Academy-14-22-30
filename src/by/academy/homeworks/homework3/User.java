package by.academy.homeworks.homework3;

import java.time.LocalDate;
import java.util.Objects;

public class User {

    private String name;
    private double money;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String eMail;

    public User(String name, double money, LocalDate dateOfBirth, String phoneNumber, String eMail) {
        this.name = name;
        this.money = money;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public User(String name, double money, String phoneNumber, String eMail) {
        this.name = name;
        this.money = money;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
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


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean hasEnoughMoney(double price) {
        return getMoney() >= price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.getMoney(), getMoney()) == 0 && Objects.equals(getName(), user.getName()) && Objects.equals(getDateOfBirth(), user.getDateOfBirth()) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(eMail, user.eMail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMoney(), getDateOfBirth(), phoneNumber, eMail);
    }

    @Override
    public String toString() {
        return name + " Деньги пользователя " + money + " Дата рождения " + dateOfBirth +
                " Номер телефона " + phoneNumber + " eMail " + eMail;
    }

}