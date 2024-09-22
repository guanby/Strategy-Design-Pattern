// Strategy Interface for Payment
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete Strategy 1 - Pay by Credit Card
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}

// Concrete Strategy 2 - Pay by PayPal
class PayPalPayment implements PaymentStrategy {
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}

// Concrete Strategy 3 - Pay by Cryptocurrency
class CryptoPayment implements PaymentStrategy {
    private String walletAddress;
    
    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Cryptocurrency wallet: " + walletAddress);
    }
}
