package by.academy.homework3.validation;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

    private static final Pattern AMERICAN_PHONE_PATTERN = Pattern.compile("\\+1\\d{10}");

    @Override
    public boolean validate(String string) {
        return string.matches(String.valueOf(AMERICAN_PHONE_PATTERN));
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
