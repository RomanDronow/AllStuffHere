package objects;

import exceptions.WrongValueException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws WrongValueException {

        //пэймент

        String name = "Роман";
        int day = 29;
        int month = 2;
        int year = 2016;
        int sum = 10000;
        Payment payment = new Payment(name, day, month, year, sum);
        System.out.println(payment + "\n");

        //репорт
        FinanceReport report = new FinanceReport(2);
        report.set(0, payment);
        report.set(1, new Payment("Ded",2,3,1955,1000000));
        report.print();
        System.out.println(report.take(1));
        System.out.println("Length: " + report.getLength());
    }
}
