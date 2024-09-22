import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private CartState state;
    private List<String> items;

    public ShoppingCart() {
        this.state = new EmptyCartState();
        this.items = new ArrayList<>();
    }

    public void setState(CartState state) {
        this.state = state;
    }

    public List<String> getItems() {
        return items;
    }

    public void addItem(String item) {
        state.addItem(this, item);
    }

    public void proceedToCheckout(PaymentStrategy strategy, int amount) {
        state.proceedToCheckout(this, strategy, amount);
    }
}
