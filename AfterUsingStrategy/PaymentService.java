package after;

import after.paymentmethods.*;

public class PaymentService {

    private int cost;
    private boolean includeDeliveryFee = true;
    private PaymentStrategy selectedPaymentStrategy;

    public void processOrder(int cost) {
        this.cost = cost;
        selectedPaymentStrategy.collectPaymentDetails();
        if (selectedPaymentStrategy.validatePaymentDetails()) {
            selectedPaymentStrategy.pay(getTotal());
        }
    }

    public void setStrategy(PaymentStrategy selectedPaymentStrategy){
        this.selectedPaymentStrategy = selectedPaymentStrategy;
    }

    public int getTotal() {
        return includeDeliveryFee ? cost + 10 : cost;
    }
}
