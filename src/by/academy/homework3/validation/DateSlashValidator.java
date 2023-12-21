package by.academy.homework3.validation;

import java.util.regex.Pattern;

public class DateSlashValidator implements Validator {

    private static final Pattern dateSlash = Pattern.compile("\\d{2}[/]\\d{2}[/]\\d{4}");

    public Pattern getPattern() {
        return dateSlash;
    }

    @Override
    public boolean validate(String string) {
        return false;
    }

}