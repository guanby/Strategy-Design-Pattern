public class PaymentStrategy {
    
    public void processOrder(String paymentMethod) {
        if ("CreditCard".equals(paymentMethod)) {
            // code to process credit card payment
        } else if ("PayPal".equals(paymentMethod)) {
            // code to process paypal 
        }
    }
}
