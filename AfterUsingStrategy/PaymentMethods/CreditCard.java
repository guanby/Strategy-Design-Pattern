package AfterUsingStrategy.PaymentMethods;

public class CreditCard {

    private int amount = 1_000;
    private final String number = null;
    private final String date = null;
    private final String cvv = null;

    // Constructor
    public CreditCard(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }
}