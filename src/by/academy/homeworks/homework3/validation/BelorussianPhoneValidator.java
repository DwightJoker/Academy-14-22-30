package by.academy.homeworks.homework3.validation;

import java.util.regex.Pattern;

public class BelorussianPhoneValidator implements Validator {

    private static final Pattern BELORUSSIAN_PHONE_PATTERN = Pattern.compile("\\+375\\d{9}");

    @Override
    public boolean validate(String string) {
        return string.matches(String.valueOf(BELORUSSIAN_PHONE_PATTERN));
    }

    @Override
    public Pattern getPattern() {
        return null;
    }

}