package Essentials_Shops;

import Essentials_Shops.Essentials;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class EssentialsTestClass {
    public static void main(String[] args) throws FileNotFoundException {
        Essentials store = new Essentials();
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to add stock? (Y/N) or (Yes/No)");
        String ans = input.nextLine();

        while (ans.toLowerCase().equals("y") || ans.toLowerCase().equals("yes")){
            System.out.println("Enter the item name:");
            String item = input.nextLine();
            System.out.println("Enter the quantity:");
            int quant = Integer.parseInt(input.nextLine());
            System.out.println("Enter the price:");
            Double price = Double.parseDouble(input.nextLine());
            store.addTostock(item, quant, price);

            System.out.println("Do you want to add stock? (Y/N) or (Yes/No)");
            String ansa = input.nextLine();

            if (ansa.toLowerCase().equals("n") || ansa.toLowerCase().equals("no"))
                break;

        }

        store.display();
        store.backup();


    }
}
