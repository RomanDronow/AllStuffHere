package strings;

import exceptions.WrongValueException;

import static strings.StringProcessor.*;

public class Main {
    public static void main(String[] args) throws WrongValueException {
        int n = 3;
        String str = "MA1TA2N";
        StringBuilder strb = new StringBuilder(str);
        System.out.println(multiply(str,n));
        System.out.println(entryCount(str,"A"));
        System.out.println(numberize(str));
        System.out.println(everySecondCharDeleter(strb));
    }
}
