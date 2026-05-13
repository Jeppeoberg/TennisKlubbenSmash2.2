package util;

import java.io.IOException;
import java.util.InputMismatchException;

public class ExceptionHandler {
    public static void HandleOutOfBounds(ArrayIndexOutOfBoundsException e){

        System.out.println("Out of bounds");
        e.printStackTrace();
    }
    public static void handleInputMismatch(InputMismatchException e){

        System.out.println("Input fejl: ikke et tal");
        e.printStackTrace();

    }
    public static void handleNullError(NullPointerException e){

        System.out.println("Null fejl");
        e.printStackTrace();

    }
    public static void handleFileError(IOException e){

        System.out.println("Fil fejl");
        e.printStackTrace();

    }

    public static void handleUnexpectedError(Exception e) {

        System.out.println("Unexpected error occurred.");
        e.printStackTrace();

    }


}


