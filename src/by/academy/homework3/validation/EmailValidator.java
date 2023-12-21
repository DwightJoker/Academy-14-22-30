package by.academy.homework3.validation;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^(.+)@(\\S+)$");

    @Override
    public boolean validate(String string) {
        return string.matches(String.valueOf(EMAIL_PATTERN));
    }

    @Override
    public Pattern getPattern() {
        return null;
    }

}