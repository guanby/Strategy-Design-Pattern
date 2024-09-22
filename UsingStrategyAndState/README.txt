Test the scenario using Client.java.

### How it Works
##### Strategy Pattern: 
We have three payment strategies (CreditCardPayment, PayPalPayment, CryptoPayment). The ShoppingCart context calls the appropriate pay() method based on the user's chosen payment strategy.

##### State Pattern: 
The shopping cart has three possible states:
- EmptyCartState: When there are no items.
- PartiallyFilledCartState: When the cart has some but not the maximum number of items.
- FullCartState: When the cart has reached its maximum capacity.
The cart transitions between states as items are added. The state influences what actions can be taken, such as proceeding to checkout.