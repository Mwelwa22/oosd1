package Assignment;

public class StockItem {

    // Attributes
    private final String stockCode;
    private int quantity;
    private double price;

    // Constructor
    public StockItem(String stockCode, int quantity, double price) {
        this.stockCode = stockCode;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public String getStockCode() { return stockCode; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public double getPriceWithVAT() {
        return price * (1 + getVAT() / 100);
    }

    public double getVAT() { return 17.5; }

    public String getStockName() { return "Unknown Stock Name"; }
    public String getStockDescription() { return "Unknown Stock Description"; }

    // Setter
    public void setPrice(double price) { this.price = price; }

    // addStock method
    public void addStock(int amount) {
        if (amount < 1) {
            System.out.println("Error: Amount to add must be at least 1.");
        } else if (quantity + amount > 100) {
            System.out.println("Error: Stock cannot exceed 100.");
        } else {
            quantity += amount;
        }
    }

    // sellStock method
    public boolean sellStock(int amount) {
        if (amount < 1) {
            System.out.println("Error: Amount to sell must be at least 1.");
            return false;
        } else if (amount <= quantity) {
            quantity -= amount;
            return true;
        } else {
            return false;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Stock Type: " + getStockName() +
                "\nDescription: " + getStockDescription() +
                "\nStock Code: " + getStockCode() +
                "\nPrice Without VAT: " + getPrice() +
                "\nPrice With VAT: " + getPriceWithVAT() +
                "\nTotal unit in stock: " + getQuantity();
    }
}
