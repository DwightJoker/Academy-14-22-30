package by.academy.lessons1to15.lesson11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DT {
        public static void main(String[] args) {

            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate localDate = LocalDate.parse("22-02-2002", formatter2);
            System.out.println(localDate);

        }
    }

