package Assignment;

public class Dashcam extends StockItem {

    private int resolution;

    public Dashcam(String stockCode, int quantity, double price, int resolution) {
        super(stockCode, quantity, price);
        this.resolution = resolution;
    }

    public int getResolution() { return resolution; }
    public void setResolution(int resolution) { this.resolution = resolution; }

    @Override
    public String getStockName() { return "Dashcam"; }

    @Override
    public String getStockDescription() { return resolution + "p HD Dashcam"; }

    @Override
    public String toString() {
        return super.toString() + "\nResolution: " + resolution + "p";
    }
}
