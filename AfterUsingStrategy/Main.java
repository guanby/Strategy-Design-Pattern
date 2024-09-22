/*
* Video Reference: https://youtu.be/Nrwj3gZiuJU
*/

package AfterUsingStrategy;

/*
 * This is the main class where we will test our strategy pattern.
 * Acting as a client here.
 */

import PayWithCreditCard;
import PayWithPayNow;

public class Main {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        // The strategy can now be easily picked at runtime

        paymentService.setStrategy(new PayWithCreditCard());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        paymentService.setStrategy(new PayWithPayNow());
        paymentService.processOrder(100);

    }

}