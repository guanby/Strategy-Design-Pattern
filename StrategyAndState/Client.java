public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // Add items to the cart
        cart.addItem("Laptop");
        cart.addItem("Mouse");
        cart.addItem("Keyboard");
        cart.addItem("Monitor");
        cart.addItem("Headphones");

        // Try adding another item
        cart.addItem("Webcam");  // Should print "Cart is full. Cannot add more items."
        
        // Choose a payment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876");
        
        // Proceed to checkout
        cart.proceedToCheckout(creditCardPayment, 1200);  // Should proceed with full cart and credit card payment
    }
}
