public class PaymentStrategy {
    
    public void processOrder(String paymentMethod) {
        if ("CreditCard".equals(paymentMethod)) {
            // code to process credit card payment
        } else if ("PayNow".equals(paymentMethod)) {
            // code to process paynow payment
        }
    }
}
