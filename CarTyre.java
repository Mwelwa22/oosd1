package Assignment;

public class CarTyre extends StockItem {

    private String tyreSize;

    public CarTyre(String stockCode, int quantity, double price, String tyreSize) {
        super(stockCode, quantity, price);
        this.tyreSize = tyreSize;
    }

    public String getTyreSize() { return tyreSize; }
    public void setTyreSize(String tyreSize) { this.tyreSize = tyreSize; }

    @Override
    public String getStockName() { return "Car Tyre"; }

    @Override
    public String getStockDescription() { return "Size: " + tyreSize; }

    @Override
    public String toString() {
        return super.toString() + "\nTyre Size: " + tyreSize;
    }
}
