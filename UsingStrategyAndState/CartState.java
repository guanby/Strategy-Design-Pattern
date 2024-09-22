// State Interface for Cart State
interface CartState {
    void addItem(ShoppingCart cart, String item);
    void proceedToCheckout(ShoppingCart cart, PaymentStrategy strategy, int amount);
}

// Concrete State 1 - Empty Cart State
class EmptyCartState implements CartState {
    @Override
    public void addItem(ShoppingCart cart, String item) {
        cart.getItems().add(item);
        cart.setState(new PartiallyFilledCartState());
        System.out.println(item + " added to cart. Cart is now partially filled.");
    }

    @Override
    public void proceedToCheckout(ShoppingCart cart, PaymentStrategy strategy, int amount) {
        System.out.println("Cart is empty. Cannot proceed to checkout.");
    }
}

// Concrete State 2 - Partially Filled Cart State
class PartiallyFilledCartState implements CartState {
    @Override
    public void addItem(ShoppingCart cart, String item) {
        cart.getItems().add(item);
        if (cart.getItems().size() >= 5) {
            cart.setState(new FullCartState());
            System.out.println(item + " added to cart. Cart is now full.");
        } else {
            System.out.println(item + " added to cart. Cart is still partially filled.");
        }
    }

    @Override
    public void proceedToCheckout(ShoppingCart cart, PaymentStrategy strategy, int amount) {
        System.out.println("Cart is not full. You can proceed to checkout but it's better to fill up the cart.");
        strategy.pay(amount);
    }
}

// Concrete State 3 - Full Cart State
class FullCartState implements CartState {
    @Override
    public void addItem(ShoppingCart cart, String item) {
        System.out.println("Cart is full. Cannot add more items.");
    }

    @Override
    public void proceedToCheckout(ShoppingCart cart, PaymentStrategy strategy, int amount) {
        System.out.println("Proceeding to checkout with a full cart.");
        strategy.pay(amount);
    }
}
