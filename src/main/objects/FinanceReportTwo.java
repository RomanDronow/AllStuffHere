package objects;

import exceptions.WrongValueException;

public class FinanceReportTwo {
    public Payment[] payments;
    public int length;

    public FinanceReportTwo(int length) throws WrongValueException{
        if (length < 1){
            throw new WrongValueException("error");
        }
        this.length = length;
        payments = new Payment[length];
    }

    public int getLength(){
        return length;
    }

    public void replace(int i, Payment p) throws WrongValueException{
        if ((i >= length) || (i < 0)) {
            throw new WrongValueException("Не найден элемент массива с указанным индексом.");
        }
        payments[i] = new Payment(p.getName(),p.getDay(),p.getMonth(),p.getYear(),p.getPayment());
    }

    public Payment take(int i)throws WrongValueException{
        if ((i >= length) || (i < 0)) {
            throw new WrongValueException("Не найден элемент массива с указанным индексом.");
        }
        return payments[i];
    }

    public void print(){
        for (int i = 0; i < payments.length; i++) {
            System.out.println(payments[i].toString()+"\n");
        }
    }
}

