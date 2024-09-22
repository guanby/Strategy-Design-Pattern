public class PaymentService {
    private int cost;
    private boolean includeDeliveryFee;
    
    public void processOrder(String paymentMethod) {
        if ("CreditCard".equals(paymentMethod)) {
            // code to process credit card payment
        
        } else if ("PayNow".equals(paymentMethod)) {
            // code to process paynow payment
            
        } else {
            // code to process other payment methods

        }
    }

    private int getTotal() {
        return includeDeliveryFee ? cost + 10 : cost;
    }
}
