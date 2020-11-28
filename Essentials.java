/**
*
*/
package Essentials_Shops;

// Import the necessary modules for file manipulation
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Essentials {
    
    PrintWriter printer = new PrintWriter(new FileOutputStream("essentials_stock.txt", true));
    
    /**
    *The constructor sets the headers in the file 
    *@return The constructor does not return anything
    */
    public Essentials() throws FileNotFoundException {
        printer.println("Item" + " " + "Quantity" + " " + "Price");
        printer.close();
    }
    
    /**
    *This method enables the user to add products to stock
    *@param itemName is the name of the product 
    *@param quant is the quantity of the product being added
    *@param price is the price of a single quantity of the product being added
    *@return The constructor does not return anything
    */
    public void addTostock(String itemName, int quant, double price) throws FileNotFoundException {
        PrintWriter printer = new PrintWriter(new FileOutputStream("essentials_stock.txt", true));
        Product item = new Product(itemName, quant, price);
        printer.println(item.item + " " + item.quantity + " " + item.price);
        printer.close();
        System.out.println("Inventory has been updated");
    }

    /**
    * The method reads the file that has the stock info and created a duplicate
    */
    public void backup() throws FileNotFoundException {
        PrintWriter safe = new PrintWriter(new FileOutputStream("backup_essentials_stock.txt", true));
        File initFile = new File("essentials_stock.txt");
        Scanner reader = new Scanner(initFile);
        while (reader.hasNext())
            safe.println(reader.nextLine());
        safe.close();
        System.out.println("File has been backed up.");

    }

    /**
    * This method displays the data in the original file containing the stock information
    */
    public void display() throws FileNotFoundException {
        File initFile = new File("essentials_stock.txt");
        Scanner reader = new Scanner(initFile);
        while (reader.hasNext())
            System.out.println(reader.nextLine());
    }

}
