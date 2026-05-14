package Assignment;

import java.util.Scanner;

public class TestPolymorphism {

    public static void itemInstance(StockItem s) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCurrent item information:");
        System.out.println(s);

        System.out.print("\nHow many units to add? ");
        int addAmount = scanner.nextInt();
        s.addStock(addAmount);
        System.out.println("After adding stock:");
        System.out.println(s);

        System.out.print("\nHow many units to sell? ");
        int sellAmount = scanner.nextInt();
        boolean sold = s.sellStock(sellAmount);
        if (sold) {
            System.out.println("After selling stock:");
        } else {
            System.out.println("Not enough stock! Current item:");
        }
        System.out.println(s);

        System.out.print("\nEnter new price: ");
        double newPrice = scanner.nextDouble();
        s.setPrice(newPrice);
        System.out.println("After price change:");
        System.out.println(s);
    }

    public static void main(String[] args) {
        StockItem[] s = new StockItem[3];

        s[0] = new CarTyre("CT101", 20, 49.99, "205/55R16");
        s[1] = new Dashcam("DC101", 15, 79.99, 1080);
        s[2] = new CarBattery("CB101", 10, 89.99, 12);

        for (int i = 0; i < s.length; i++) {
            System.out.println("\n--- Processing item " + (i + 1) + " ---");
            itemInstance(s[i]);
        }
    }
}
