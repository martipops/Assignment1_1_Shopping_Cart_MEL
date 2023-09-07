/**
 * Item: represents a product with a name, brand, price, and barcode.
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 1.1 - Shopping Cart
 * Fall/2023
 */
public class Item {

    private String name;
    private String brand;
    private double price;
    private String barcode;

    /**
     * Construct a new Item object with the specified information.
     *
     * @param name    The name of the item.
     * @param brand   The brand of the item.
     * @param price   The price of the item.
     * @param barcode The barcode of the item.
     */
    public Item(String name, String brand, double price, String barcode) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.barcode = barcode;
    }

    /**
     * Gets the name of the item.
     *
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the item.
     *
     * @param name The new name for the item.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the brand of the item.
     *
     * @return The brand of the item.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the brand of the item.
     *
     * @param brand The new brand for the item.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Gets the price of the item.
     *
     * @return The price of the item.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the item.
     *
     * @param price The new price for the item.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the barcode of the item.
     *
     * @return The barcode of the item.
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the barcode of the item.
     *
     * @param barcode The new barcode for the item.
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * Returns a string representation of the item.
     *
     * @return A string containing the item's name, brand, price, and barcode.
     */
    @Override
    public String toString() {
        return "Item [name=" + name + ", brand=" + brand + ", price=" + price + ", barcode=" + barcode + "]";
    }
}
