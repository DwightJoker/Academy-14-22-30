package by.academy.homework3.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Pattern;

public class DateValidator implements Validator {


//    private static final String VALID_DATE_FORMAT_B = "dd-MM-yyyy";
//    private static final String VALID_DATE_FORMAT_A = "dd/MM/yyyy";
//    private static final Pattern VALID_DATE_FORMAT_B = Pattern.compile("dd-MM-yyyy");

    private static final Pattern VALID_DATE_FORMAT = Pattern.compile("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$");

    public static LocalDate getDate(String dateString){
        if(dateString.matches(String.valueOf(VALID_DATE_FORMAT))){
            return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }else {
            return null;
        }
    }
    @Override
    public boolean validate(String string) {
        return false;
    }

    //    @Override
//    public boolean validate(String string) {
//        return VALID_DATE_FORMAT_A().matcher(string).matches();
////        return string.matches(String.valueOf(VALID_DATE_FORMAT_A)) || string.matches(VALID_DATE_FORMAT_B);
//    }
    @Override
    public Pattern getPattern() {
        return VALID_DATE_FORMAT;
    }

    @Override
    public boolean gPV(String string) {
        return Validator.super.gPV(string);
    }

}
