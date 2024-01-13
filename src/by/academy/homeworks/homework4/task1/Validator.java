package by.academy.homeworks.homework4.task1;

import java.util.regex.Pattern;

public interface Validator {

    Pattern getPattern();

    default boolean validation(String string) {
        return getPattern().matcher(string).matches();
    }

}