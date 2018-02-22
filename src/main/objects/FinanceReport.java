package objects;

import java.util.ArrayList;

public class FinanceReport {

    public ArrayList<Payment> payments;

    public FinanceReport() {
        payments = new ArrayList<Payment>();
    }

    public FinanceReport(int i){
        payments = new ArrayList<Payment>();
//        payments.trimToSize(i);
    }

    public int getLength() {
        return payments.size();
    }

    public void set(int i, Payment p) {
        payments.add(i, p);
    }

    public Payment take(int i) {
        return payments.get(i);
    }

    public void print() {
        for (Payment payment : payments
                ) {
            System.out.println(payment);
        }
    }
}
