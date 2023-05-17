public class CreditPaymentService {
    public int calculate(int period, int amountCredit) {
        double interestrate = 9.99;
        double periodOnemonth = interestrate / 12 / 100;
        double part = Math.pow(1 + periodOnemonth, period);
        double partone = part - 1;
        double parttwo = periodOnemonth * part / partone;
        int payment = (int) (amountCredit * parttwo);


        return payment;
    }

}



