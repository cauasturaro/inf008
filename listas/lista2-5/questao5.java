class CalculadoraFrete {
    private double peso;
    private double distancia;
    private double x, y, z;
    private TipoEntrega tipoeEntrega;


    // base com todos os parâmetros
    private static double calcularBase(double peso, double distancia, TipoEntrega tipo, double volume) {
        return (peso * 0.1 * distancia) + tipo.getValue() + (0.5 * volume);
    }

    // Só peso (default tudo)
    public static double calcularFrete(double peso) {
        return calcularBase(peso, 100, TipoEntrega.NORMAL, 0);
    }

    // Peso + distância
    public static double calcularFrete(double peso, double distancia) {
        return calcularBase(peso, distancia, TipoEntrega.NORMAL, 0);
    }

    // Peso + distância + tipo
    public static double calcularFrete(double peso, double distancia, TipoEntrega tipoEntrega) {
        return calcularBase(peso, distancia, tipoEntrega, 0);
    }

    // Completo (com volume)
    public static double calcularFrete(double peso, double distancia, TipoEntrega tipoEntrega, double x, double y, double z) {
        double volume = x * y * z;
        return calcularBase(peso, distancia, tipoEntrega, volume);
    }

}

enum TipoEntrega {
    NORMAL(10),
    RAPIDA(15),
    MUITO_RAPIDA(20);

    private final int precoEntrega;

    private TipoEntrega(int precoEntrega) {
        this.precoEntrega = precoEntrega;
    }
    
    public int getValue() { return this.precoEntrega; }
}

public class questao5 {
    public static void main(String[] args) {

        double f1 = CalculadoraFrete.calcularFrete(10);
        double f2 = CalculadoraFrete.calcularFrete(10, 200);
        double f3 = CalculadoraFrete.calcularFrete(10, 200, TipoEntrega.RAPIDA);
        double f4 = CalculadoraFrete.calcularFrete(10, 200, TipoEntrega.MUITO_RAPIDA, 2, 3, 4);

        System.out.println("Peso apenas: " + f1);
        System.out.println("Peso + distância: " + f2);
        System.out.println("Com tipo: " + f3);
        System.out.println("Completo (com volume): " + f4);
    }
}
