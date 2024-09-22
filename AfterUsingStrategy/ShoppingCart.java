/*
* Video Reference: https://youtu.be/Nrwj3gZiuJU
*/

package after;

/*
 * This is the main class where we will test our strategy pattern.
 * Acting as a client here.
 */

import after.paymentmethods.*;
import after.PaymentService;

public class ShoppingCart {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        // The strategy can now be easily picked at runtime

        // Choose the Credit Card Strategy
        paymentService.setStrategy(new PayWithCreditCard());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        // Choose the PayNow Strategy
        paymentService.setStrategy(new PayWithPayNow());
        paymentService.processOrder(100);

    }

}