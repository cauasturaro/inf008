class ContaBancaria {
    private String numero;
    private double saldo;
    private String tipo; // "CORRENTE" ou "POUPANCA"

    public ContaBancaria(String numero, String tipo) {
        this.numero = numero;
        if (!tipo.equals("CORRENTE") && !tipo.equals("POUPANÇA")) 
            throw new IllegalArgumentException("Tipo inválido");
        this.tipo = tipo;
        this.saldo = 0.0;
    }
    
    // TODO: Implementar chamada a outro construtor
    // TODO: Validar saldoInicial >= 0
    public ContaBancaria(String numero, String tipo, double saldoInicial) {
        this(numero, tipo);
        if (saldoInicial >= 0)
            this.saldo = saldoInicial;
    }

    // TODO: Criar métodos sobrecarregados para depositar
    // depositar(double valor) e depositar(double valor, String descricao)
    public void depositar(double valor) {
        if (!validarValor(valor)) {
            throw new IllegalArgumentException("VAlor inválido");
        }
        
            this.saldo += valor;
    }

    public void depositar(double valor, String descricao) {
        depositar(valor);
        System.out.println(valor + " - " + descricao);
    }


    private boolean validarValor(double valor) {
        return valor > 0;
    }

    // TODO: Criar getters APENAS para os atributos necessários
    public String getNumero () { return this.numero; }
    public String getTipo () { return this.tipo; }
    public double getSaldo () { return this.saldo; }
}

public class questao1 {
    public static void main(String[] args) {
        
    }
}


