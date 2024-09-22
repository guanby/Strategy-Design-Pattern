package after;

import after.paymentmethods.*;

public class PaymentService {

    private int cost;
    private boolean includeDeliveryFee = true;

    private PaymentStrategy strategy;

    public void processOrder(int cost) {
        this.cost = cost;
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public int getTotal() {
        return includeDeliveryFee ? cost + 10 : cost;
    }

}