/**
 * ShoppingCart: represents a shopping cart that can hold items.
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 1.1 - Shopping Cart
 * Fall/2023
 */
public class ShoppingCart {

    private ArrayBag<Item> cart;

    /**
     * Constructs a new ShoppingCart object.
     */
    public ShoppingCart() {
        cart = new ArrayBag<>();
    }

    /**
     * Adds an item to the shopping cart.
     *
     * @param item The item to be added.
     */
    public void addItem(Item item) {
        cart.add(item);
        System.out.println("Item added: " + item.getName());
    }

    /**
     * Removes an item from the shopping cart.
     *
     * @param item The item to be removed.
     */
    public void removeItem(Item item) {
        if (cart.contains(item)) {
            cart.remove(item);
            System.out.println("Item removed: " + item.getName());
        } else {
            System.out.println("Item not found in the cart: " + item.getName());
        }
    }

    /**
     * Shows the contents of the shopping cart.
     */
    public void showContents() {
        Object[] items = cart.toArray();
        System.out.println("Shopping Cart Contents:");
        for (Object item : items) {
            // Type checking for safety...
            if (item instanceof Item) {
                System.out.println(item);
            }
        }
    }

    /**
     * Calculates the total price of all items in the shopping cart.
     *
     * @return The total price.
     */
    public double calculateTotalPrice() {
        Object[] items = cart.toArray();
        double totalPrice = 0;
        for (Object item : items) {
            // Type checking for safety...
            if (item instanceof Item) {
                totalPrice += ((Item) item).getPrice();
            }
        }
        return totalPrice;
    }

    /**
     * Gets the number of items in the shopping cart.
     *
     * @return The number of items.
     */
    public int getItemCount() {
        return cart.getCurrentSize();
    }

    /**
     * Clears all items from the shopping cart.
     */
    public void clearCart() {
        cart.clear();
        System.out.println("Shopping cart cleared.");
    }
}
