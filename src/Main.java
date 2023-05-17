//
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService ();
        int amountCredit = 1_000_000;

        int payment = service.calculate (12, amountCredit);
        System.out.println(payment);

        int paymentone = service.calculate (24, amountCredit);
        System.out.println(paymentone);

        int paymenttwo = service.calculate (36, amountCredit);
        System.out.println(paymenttwo);
    }
    }
