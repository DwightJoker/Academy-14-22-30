package by.academy.homework3.validation;

import java.util.regex.Pattern;

public class DateDashValidator implements Validator {

    private static final Pattern dateDash = Pattern.compile("\\d{2}[-]\\d{2}[-]\\d{4}");

    public Pattern getPattern() {
        return dateDash;
    }

    @Override
    public boolean validate(String string) {
        return false;
    }

}