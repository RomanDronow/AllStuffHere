package objects;

import exceptions.WrongValueException;

import java.util.Objects;

public class Payment {
    private String name;
    private int day, month, year, payment;

    private boolean checkYear(int year) {
        return year > 0;
    }

    private boolean checkMonth(int month) {
        return ((month > 0) && (month < 13));
    }

    private boolean checkDay(int year, int month, int day) {
        int[] monthLen = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) monthLen[1] = 29;
        return ((day > 0) && (day <= monthLen[month - 1]));
    }

    private boolean checkPayment(int payment) {
        return payment > 0;
    }

    public Payment(){
        name = "Name";
        day = 1;
        month = 1;
        year = 2001;
        payment = 1;
    }

    public Payment(String name, int day, int month, int year, int payment) throws WrongValueException {
        if (!checkYear(year)) throw new WrongValueException("Ошибка в годе");
        if (!checkMonth(month)) throw new WrongValueException("Ошибка в месяце");
        if (!checkDay(year, month, day)) throw new WrongValueException("Ошибка в дне");
        if (!checkPayment(payment)) throw new WrongValueException("Ошибка в сумме платежа");
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.payment = payment;
    } // сеттер и конструктор

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Платеж: \n Имя: " + name + "\n Дата: " + day + "." + month + "." + year + "\n Сумма платежа: " + payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment1 = (Payment) o;
        return day == payment1.day &&
                month == payment1.month &&
                year == payment1.year &&
                payment == payment1.payment &&
                Objects.equals(name, payment1.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, day, month, year, payment);
    }
}
