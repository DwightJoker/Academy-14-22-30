package by.academy.homework3;

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
    }
