package strings;

import exceptions.WrongValueException;

public class StringProcessor {

    public static String multiply(String str, int n) throws WrongValueException {
        String dest = new String();
        if (n < 0) throw new WrongValueException("Число N меньше нуля");
        else if (n == 0) {
            dest = "";
        } else {
            for (int i = 0; i < n; i++) {
                dest += str;
            }
        }
        return dest;
    }

    public static int entryCount(String deb, String sub) {
        int counter = 0;
        if (deb.equals(sub))
            return 1;
        if (!deb.equals("")) {
            while (deb.contains(sub)) {
                deb = deb.substring(deb.indexOf(sub) + 1);
                counter++;
            }
        }
        return counter;
    }

    public static String numberize(String str){
        str = str.replace("1","one");
        str = str.replace("2","two");
        str = str.replace("3","three");
        return str;
    }

    public static StringBuilder everySecondCharDeleter(StringBuilder strb){
        for (int i = 1; i < strb.length(); i++) {
            strb.deleteCharAt(i);
        }
        return strb;
    }
}
