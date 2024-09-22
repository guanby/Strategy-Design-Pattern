package after.paymentmethods;

public class CreditCard {

    private int amount = 1_000;
    private String number = null;
    private String date = null;
    private String cvv = null;

    // Constructor
    public CreditCard(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    // Getters and Setters
    public int getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setNumber(int amount) {
        this.amount = amount;
    }
}