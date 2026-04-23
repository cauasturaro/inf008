class EnergyUsageBill {
    private String addressNumber;
    private String ownerName;
    private double usage = 0.0;
    private double baseCost = 50.0;
    private Flag taxFlag;

    public EnergyUsageBill(String addressNumber, String ownerName, Flag taxFlag) {
        this.addressNumber = addressNumber;
        this.ownerName = ownerName;
        this.taxFlag = taxFlag;
    }

    public void registerUsage(double amount) {
        if (amount < 0) {
            System.err.println("Consumo inválido");
            return;
        }

        this.usage += amount;
    }

    public double calculateBill() {
        return this.baseCost + this.usage * this.taxFlag.getValue();
    }

    public void applyDiscount(double amount) {
        if (amount > 0 && this.calculateBill() - amount > 0)
            this.usage -= amount / this.taxFlag.getValue();
    }

    public void display() {
        System.out.println("AddressNumber: " + this.addressNumber);
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Usage: " + this.usage);
        System.out.println("Flag: " + this.taxFlag);
        System.out.println("Cost: " + this.calculateBill());
    }
}

enum Flag {
    GREEN(2),
    YELLOW(3),
    RED(4);

    private final int value;

    Flag(int value) { this.value = value; }

    public int getValue() { return this.value; }
}

public class questao2 {
    public static void main(String[] args) {
        EnergyUsageBill energyBill1 = new EnergyUsageBill("123", "Cauã", Flag.GREEN);
        energyBill1.registerUsage(100.5);
        energyBill1.display();

        EnergyUsageBill energyBill2 = new EnergyUsageBill("432", "Sandro", Flag.YELLOW);
        energyBill2.registerUsage(100.5);
        energyBill2.display();

        EnergyUsageBill energyBill3 = new EnergyUsageBill("543", "Flávia", Flag.RED);
        energyBill3.registerUsage(100.5);
        energyBill3.display();
    }

}
