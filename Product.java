/**
*
*/
package Essentials_Shops;

public class Product {
    //instance variables are the properties of each product
    String item;
    double price;
    int quantity;

    /**
    *@param product is the name of the product
    *@param amount is the quantity of the product
    *@param cost is the price of one quantity of the product
    *@return The constructor does not return anything
    */
    public Product(String product, int amount, double cost) {
        item = product;
        price = cost;
        quantity = amount;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}
