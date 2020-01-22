package Essentials_Shops;

public class Product {
    String item;
    double price;
    int quantity;

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
