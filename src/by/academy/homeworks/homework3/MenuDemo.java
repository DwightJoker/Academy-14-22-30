package by.academy.homeworks.homework3;

import by.academy.homeworks.homework3.products.Boat;
import by.academy.homeworks.homework3.products.Car;
import by.academy.homeworks.homework3.products.Product;
import by.academy.homeworks.homework3.products.Vegetable;
import by.academy.homeworks.homework3.validation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuDemo {
    private static final Validator EMAIL_VALIDATOR = new EmailValidator();
    private static final Validator BEL_PHONE = new BelorussianPhoneValidator();


    public static void main(String[] args) {
        User seller = null;
        User buyer = null;

        Scanner sc = new Scanner(System.in);

        Deal deal = new Deal();
        System.out.println("\nДобро пожаловать в Магазин\n");
        System.out.println("Введите действие: ");
        showDefaultMenu();
        whileBlock:
        while (true) {
            String action = sc.next();
            switch (action) {
                case "1":
                    System.out.println("Создаем продавца");
                    seller = createSeller(sc);
                    deal.setSeller(seller);
                    System.out.println("Продавец успешно создан");
                    System.out.println("2 - Создать покупателя, " + "3 - Добавить товары в корзину \n4 - Просмотреть корзину, " + "5 - Удалить товар из корзины, 6 - Печать чека\n0 - Выход");
                    continue;

                case "2":
                    System.out.println("Создаем покупателя");
                    buyer = createBuyer(sc);
                    deal.setBuyer(buyer);
                    System.out.println("Покупатель успешно создан");
                    System.out.println("3 - Добавить товары в корзину \n4 - Просмотреть корзину, " + "5 - Удалить товар из корзины, 6 - Печать чека\n0 - Выход");
                    continue;
                case "3":
                    if (seller == null || buyer == null) {
                        System.out.println("Отсутствует информация о покупателе или продавце");
                        System.out.println("Выберите дельнейшее действие: ");
                        showDefaultMenu();
                        continue;
                    }
                    Product p = createProduct(sc);
                    if (p != null) {
                        Container.add(p);
                        System.out.println("Товар добавлен в корзину");
                    } else {
                        System.out.println("Зина отмена");
                    }
                    System.out.println("Выберите дельнейшее действие: ");
                    System.out.println("3 - Добавить товары в корзину, 4 - Просмотреть корзину, " + "5 - Удалить товар из корзины, 6 - Печать чека\n0 - Выход");
                    continue;
                case "4":
                    Container.printContainer();
                    System.out.println("Выберите дельнейшее действие: ");
                    System.out.println("3 - Добавить товары в корзину, 5 - Удалить товар из корзины, 6 - Печать чека\n0 - Выход");
                    continue;
                case "5":
                    System.out.print("Индекс товара для удаления: ");
                    Container.removeProductFromCart(sc.nextInt());
                    System.out.println("Выберите дельнейшее действие: ");
                    System.out.println("4 - Просмотреть корзину, 5 - Удалить товар из корзины, 6 - Печать чека\n0 - Выход");
                    continue;
                case "6":
                    if (seller == null || buyer == null || Container.isEmpty()) {
                        System.out.println("Отсутствует информация о покупателе/продавце/пустая корзина");
                        System.out.println("Выберите дельнейшее действие: ");
                        showDefaultMenu();
                        continue;
                    }
                    deal.printBill();
                    System.out.println("\n Ожидается оплата \n");
                    deal.dealDone();
                    break whileBlock;
                case "0":
                    break whileBlock;

            }
        }
        sc.close();
    }


    public static Product createProduct(Scanner sc) {

        System.out.println("Введите номер продукта для покупки");
        System.out.println("1-Овощи, 2-Лодка, 3-Машина, 0 - для отмены");
        Product product = null;

        switch (sc.next()) {
            case "1":
                System.out.println("Введите количество огурцов");
                int quantity = sc.nextInt();
                product = new Vegetable("Овощ", 200, quantity, "Огурец", "зеленый");
                break;

            case "2":
                System.out.println("Введите количество лодок");
                int quantity1 = sc.nextInt();
                product = new Boat("Лодка", 5000, quantity1, "Rolls-Royce", "48 узлов");
                break;

            case "3":
                System.out.println("Введите количество машин");
                int quantity2 = sc.nextInt();
                product = new Car("Машина", 10000, quantity2, "Audi", 4.0);
                break;

            case "0":
                break;
        }
        return product;
    }


    public static User createSeller(Scanner sc) {
        System.out.println("Введите имя");
        String sellerName = sc.next();

        System.out.println("Введите email");
        String sellerEmail = null;
        while (sellerEmail == null) {
            sellerEmail = sc.next();
            if (!EMAIL_VALIDATOR.validate(sellerEmail)) {
                sellerEmail = null;
                System.out.println("Неверно указан email, повторите попытку");
            }
        }
        System.out.println("Введите телефон");
        String sellerPhoneNumber = null;
        while (sellerPhoneNumber == null) {
            sellerPhoneNumber = sc.next();
            if (!BEL_PHONE.validate(sellerPhoneNumber)) {
                sellerPhoneNumber = null;
                System.out.println("Неверно указан номер телефона, повторите попытку");
            }
        }
        System.out.println("Введите количество денег продавца");
        int sellerMoney = sc.nextInt();

        LocalDate sellerBirthDate = checkBirthDate();

        User seller = new User(sellerName, sellerMoney, sellerBirthDate, sellerPhoneNumber, sellerEmail);
        return seller;
    }

    public static User createBuyer(Scanner sc) {
        System.out.println("Введите имя");
        String buyerName = sc.next();

        System.out.println("Введите email");
        String buyerEmail = null;
        while (buyerEmail == null) {
            buyerEmail = sc.next();
            if (!EMAIL_VALIDATOR.validate(buyerEmail)) {
                buyerEmail = null;
                System.out.println("Неверно указан email, повторите попытку");
            }
        }
        System.out.println("Введите телефон");
        String buyerPhoneNumber = null;
        while (buyerPhoneNumber == null) {
            buyerPhoneNumber = sc.next();
            if (!BEL_PHONE.validate(buyerPhoneNumber)) {
                buyerPhoneNumber = null;
                System.out.println("Неверно указан номер телефона, повторите попытку");
            }
        }
        System.out.println("Введите количество денег покупателя");
        int buyerMoney = sc.nextInt();

        LocalDate buyerBirthDate = checkBirthDate();

        User buyer = new User(buyerName, buyerMoney, buyerBirthDate, buyerPhoneNumber, buyerEmail);
        return buyer;

    }

    private static LocalDate checkBirthDate() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter;
        LocalDate dateOfBirth;
        for (; ; ) {
            System.out.println("Введите дату рождения в формате (dd/MM/yyyy) или (dd-MM-yyyy)");
            String userDate = sc.nextLine();
            Validator date = new DateDashValidator();
            Validator date2 = new DateSlashValidator();
            if (date.validation(userDate)) {
                formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                dateOfBirth = LocalDate.parse(userDate, formatter);
                break;
            } else if (date2.validation(userDate)) {
                formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                dateOfBirth = LocalDate.parse(userDate, formatter);
                break;
            } else {
                System.out.println("Неверно введена дата");
            }
        }
        return dateOfBirth;
    }

    private static void showDefaultMenu() {
        System.out.println("1 - Создать продавца, 2 - Создать покупателя, " + "3 - Добавить товары в корзину \n4 - Просмотреть корзину, " + "5 - Удалить товар из корзины, 6 - Печать чека\n0 - Выход");
    }

}