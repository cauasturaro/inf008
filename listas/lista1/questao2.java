class CashRegister {
    private double currentBalance;
    private int transactionCount;
    private String registerId;

    public CashRegister() {}

    public CashRegister(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public CashRegister(double currentBalance, int transactionCount) {
        this(currentBalance);
        this.transactionCount = transactionCount;
    }

    public void processPayment(double amount) {
        if (amount <= 0) 
            return;
        this.currentBalance += amount;
        this.transactionCount++;
    }

    public void processPayment(int amount) {
        if (amount <= 0) 
            return;
        this.currentBalance += amount;
        this.transactionCount++;
    }

    public void processRefund(double amount) {
        if (amount <= 0)
            return;
        this.currentBalance -= amount;
        this.transactionCount++;
    }

    public String getDailyReport() { //dúvida (consultar lista e reler questão para entender descrição e relatório, pois os atributos da classe são insuficientes)
        return "";
    }
}

public class questao2 {
    public static void main(String[] args) {
        
    }
}
