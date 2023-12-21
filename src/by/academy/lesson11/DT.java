package by.academy.lesson11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class DT {
        public static void main(String[] args) {

            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate localDate = LocalDate.parse("22-02-2002", formatter2);
            System.out.println(localDate);

        }
    }

