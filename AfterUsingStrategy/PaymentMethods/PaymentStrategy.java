package after.paymentmethods;

public interface PaymentStrategy {

    /*
     * Methods to be implemented by concrete payment methods.
     */

    void collectPaymentDetails();
    
    boolean validatePaymentDetails();

    void pay(int amount);

}