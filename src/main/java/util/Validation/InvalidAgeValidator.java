package util.Validation;

import util.InvalidAgeException;

public class InvalidAgeValidator {

    public static void validate(int age) throws  InvalidAgeException{
        if (age < 0 || age > 130){
            throw new InvalidAgeException("Age kan ikke være minus(eller over 130 dit gammle svin)");

        }
    }
}
