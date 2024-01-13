package by.academy.homeworks.homework3.validation;

import java.util.regex.Pattern;

public interface Validator {

    public boolean validate(String string);


    Pattern getPattern();

    default boolean validation(String string) {
        return getPattern().matcher(string).matches();
    }

}