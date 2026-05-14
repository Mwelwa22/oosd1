package Assignment;

public class TestNavSys {
    public static void main(String[] args) {
        // Task 1 - Create NavSys with 10 units
        NavSys nav = new NavSys("NS101", 10, 99.99);
        System.out.println("Task 1 - Created item:");
        System.out.println(nav);

        // Task 2 - Add 10 more units
        nav.addStock(10);
        System.out.println("\nTask 2 - Added 10 stock:");
        System.out.println(nav);

        // Task 3 - Sell 2 units
        nav.sellStock(2);
        System.out.println("\nTask 3 - Sold 2 units:");
        System.out.println(nav);
