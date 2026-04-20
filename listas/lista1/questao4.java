class InventoryItem {
    private String itemCode;
    private String description;
    private double unitPrice;
    private int quantityInStock;
    private int minimumStockLevel;


    public InventoryItem(String itemCode, double unitPrice) {
        this.itemCode = itemCode;
        this.unitPrice = unitPrice;
    }

    public InventoryItem(String itemCode, double unitPrice, String description) {
        this(itemCode, unitPrice);
        this.description = description;
    }

    public void applyDiscount(double percentage) {
        this.unitPrice = this.unitPrice - this.unitPrice * percentage/100;
    }

    public void updateStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void updateStock(int quantityInStock, int minimumStockLevel) {
        updateStock(quantityInStock);
        this.minimumStockLevel = minimumStockLevel;
    }

    public boolean isBelowMinimumStock() {
        return this.quantityInStock < this.minimumStockLevel;
    }

}



public class questao4 {
    public static void main(String[] args) {
        
    }
}