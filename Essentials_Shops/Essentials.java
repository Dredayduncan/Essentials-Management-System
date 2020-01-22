package Essentials_Shops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Essentials {
    PrintWriter printer = new PrintWriter(new FileOutputStream("essentials_stock.txt", true));
    PrintWriter safe = new PrintWriter(new FileOutputStream("backup_essentials_stock.txt", true));

    public Essentials() throws FileNotFoundException {
        printer.println("Item" + " " + "Quantity" + " " + "Price");
        printer.close();
    }

    public void addTostock(String itemName, int quant, double price) throws FileNotFoundException {
        PrintWriter printer = new PrintWriter(new FileOutputStream("essentials_stock.txt", true));
        Product item = new Product(itemName, quant, price);
        printer.println(item.item + " " + item.quantity + " " + item.price);
        printer.close();
        System.out.println("Inventory has been updated");
    }

    public void backup() throws FileNotFoundException {
        File initFile = new File("essentials_stock.txt");
        Scanner reader = new Scanner(initFile);
        while (reader.hasNext())
            safe.println(reader.nextLine());
        safe.close();
        System.out.println("File has been backed up.");

    }

    public void display() throws FileNotFoundException {
        File initFile = new File("essentials_stock.txt");
        Scanner reader = new Scanner(initFile);
        while (reader.hasNext())
            System.out.println(reader.nextLine());
    }

}
