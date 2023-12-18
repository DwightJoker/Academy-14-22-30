package by.academy.homework3.err;

import by.academy.homework3.validation.Validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

//public class Trash {
//
//    private static final Pattern VALID_DATE_FORMAT_A = Pattern.compile("dd/MM/yyyy");
//
//    private static final Pattern VALID_DATE_FORMAT_B = Pattern.compile("dd-MM-yyyy");
//
//    public static LocalDate getDate(String dateString){
//        if(VALID_DATE_FORMAT_A.matcher(dateString).matches()){
////            return LocalDate.parse(dateString, DateTimeFormatter.ofPattern(String.valueOf(VALID_DATE_FORMAT_A)));
//            return LocalDate.parse(dateString);
//        } else if (dateString.matches(String.valueOf(VALID_DATE_FORMAT_B))) {
//            VALID_DATE_FORMAT_A.matcher(dateString).matches();
//            return LocalDate.parse(dateString, DateTimeFormatter.ofPattern(String.valueOf(VALID_DATE_FORMAT_B)));
//        }else {
//            return null;
//        }
//    }
//}



//        LocalDateTime LocalDate = LocalDateTime.parse("June 18, 2019 12:01 AM",
//                DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a", Locale.US));
//                    return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH));
//        System.out.println(LocalDate.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a", Locale.US)));





//public class DateValidator implements Validator {
//
//    private static final String VALID_DATE_FORMAT_A = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]$";
//
//    private static final String VALID_DATE_FORMAT_B = "dd-MM-yyyy";
//
//    public static LocalDate getDate(String dateString){
//        if(dateString.matches(VALID_DATE_FORMAT_A)){
//            return LocalDate.parse(dateString, DateTimeFormatter.ofPattern(VALID_DATE_FORMAT_A));
//        } else if (dateString.matches(VALID_DATE_FORMAT_B)) {
//            return LocalDate.parse(dateString, DateTimeFormatter.ofPattern(VALID_DATE_FORMAT_B));
//        }else {
//            return null;
//        }
//
//    }
//
//    @Override
//    public boolean validate(String string) {
//        return string.matches(VALID_DATE_FORMAT_A) || string.matches(VALID_DATE_FORMAT_B);
//    }
//}

