package by.academy.homework3.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class DateDashValidator implements Validator {


    private static final Pattern VALID_DATE_FORMAT = Pattern.compile("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$");

    @Override
    public boolean validate(String string) {
        return false;
    }

    @Override
    public Pattern getPattern() {
        return null;
    }

    @Override
    public boolean gPV(String string) {
        return Validator.super.gPV(string);
    }
}
