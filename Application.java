/**
 * Application: Tests each method and functionality of the Shopping Cart class. 
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 1.1 - Shopping Cart
 * Fall/2023
 */

public class Application {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item bananas = new Item("Bananas","Dole", 2.99, "124124124");
        Item pie = new Item("Chocolate Mousse Pie", "Louisiana Pie Kitchen", 16.49, "845845845");
        Item ductTape = new Item("Duct Tape", "3M", 7.99, "295295295");

        cart.addItem(bananas);
        cart.addItem(pie);
        cart.addItem(ductTape);

        cart.showContents();

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Amt of items in cart: " + cart.getItemCount());

        cart.removeItem(pie);
        System.out.println("Amt of items in cart: " + cart.getItemCount());

        cart.clearCart();
        System.out.println("Amt of items in cart: " + cart.getItemCount());
    }
}
