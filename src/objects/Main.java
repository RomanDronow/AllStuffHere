package objects;

import exceptions.WrongValueException;

public class Main {
    public static void main(String[] args) throws WrongValueException {

        //пэймент

        String name = "Роман";
        int day = 29;
        int month = 2;
        int year = 2016;
        int sum = 10000;
        Payment payment = new Payment(name, day, month, year, sum);
        System.out.println(payment);

        //репорт


    }
}
