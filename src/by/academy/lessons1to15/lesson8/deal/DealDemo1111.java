//package by.academy.homeworks.homework3.err;
//
//import by.academy.homeworks.homework3.User;
//import by.academy.homeworks.homework3.validation.BelorussianPhoneValidator;
//import by.academy.homeworks.homework3.validation.EmailValidator;
//
//import java.util.Scanner;
//
//public class DealDemo{
//    public static void main(String[] args) {
//
//        System.out.println("Введите данные продавца");
//
//        Scanner seller = new Scanner(System.in);
//        System.out.print("Введите имя продавца: ");
//        String sellerName = seller.nextLine();
//
//        System.out.print("Введите телефон продавца: ");
//        String sellerPhone = seller.nextLine();
//
//        BelorussianPhoneValidator belSellerPhoneValidator = new BelorussianPhoneValidator();
//        boolean isSellerPhoneValid = belSellerPhoneValidator.validate(sellerPhone);
//        while (!isSellerPhoneValid) {
//            System.out.println("Неверно указан номер телефона, повторите попытку");
//            sellerPhone = seller.nextLine();
//            isSellerPhoneValid = belSellerPhoneValidator.validate(sellerPhone);
//        }
//
//        System.out.print("Введите email продавца: ");
//        String sellerMail = seller.nextLine();
//        EmailValidator emailSellerValidator = new EmailValidator();
//        boolean isSellerEmailValid = emailSellerValidator.validate(sellerMail);
//        while (!isSellerEmailValid) {
//            System.out.println("Неверно указан email, повторите попытку");
//            sellerMail = seller.nextLine();
//            isSellerEmailValid = emailSellerValidator.validate(sellerMail);
//        }
//        User sellerInfo = new User(sellerName,0.0,sellerPhone,sellerMail);
//
//        System.out.println("Введите данные покупателя");
//
//        Scanner buyer = new Scanner(System.in);
//        System.out.print("Введите имя покупателя: ");
//        String buyerName = buyer.nextLine();
//
//        System.out.print("Введите количество денег покупателя: ");
//        double buyerMoney = buyer.nextDouble();
//
//        System.out.print("Введите дату рождения покупателя: ");
//        String buyerDate = buyer.nextLine();
////        DateHandler dataBuyerValidator = new DateValidator();
////        boolean isBuyerDateValid = dataBuyerValidator.validate(buyerDate);
////        while (! isBuyerDateValid) {
////            System.out.println("Неверно указан email, повторите попытку");
////            buyerDate = buyer.nextLine();
////            isBuyerDateValid = dataBuyerValidator.validate(buyerDate)
////        }
////        LocalDate date = null;
////        while(date == null) {
////            String dateStr = sc.nextLine();
////
////            if (date1.validate(dateStr)) {
////                date = parseFormat1(dateStr);
////            } else if (date2.validate(dateStr)) {
////                date = parseFormat1(dateStr);
////            } else {
////                date  = null;
////                System.out.println("Неправильная дата");
////            }
////        }
////
////        System.out.println("Ввод дата рождения");
////    }
//
//        System.out.print("Введите телефон покупателя: ");
//        String buyerPhone = buyer.nextLine();
//        BelorussianPhoneValidator belBuyerPhoneValidator = new BelorussianPhoneValidator();
//        boolean isBuyerPhoneValid = belBuyerPhoneValidator.validate(buyerPhone);
//        while (!isBuyerPhoneValid) {
//            System.out.println("Неверно указан номер телефона, повторите попытку");
//            buyerPhone = buyer.nextLine();
//            isBuyerPhoneValid = belBuyerPhoneValidator.validate(buyerPhone);
//        }
//
//        System.out.print("Введите email покупателя: ");
//        String buyerMail = buyer.nextLine();
//        EmailValidator emailBuyerValidator = new EmailValidator();
//        boolean isBuyerEmailValid = emailBuyerValidator.validate(buyerMail);
//        while (!isBuyerEmailValid) {
//            System.out.println("Неверно указан email, повторите попытку");
//            buyerMail = buyer.nextLine();
//            isBuyerEmailValid = emailBuyerValidator.validate(buyerMail);
//        }
//    }
//}
