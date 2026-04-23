class StorageProduct {
    private String name;
    private String code;
    private int initialQuantity;
    private double unityPrice;

    public StorageProduct(String name, String code){
        if (code == null || code.isBlank())
            throw new IllegalArgumentException("Code is necessary");

        this.name = name;
        this.code = code;
        this.initialQuantity = 0;
        this.unityPrice = 0.0;
    }

    public StorageProduct(String name, String code, int initialQuantity, double unityPrice)
    {
        this(name, code);
        this.initialQuantity = initialQuantity;
        this.unityPrice = unityPrice;
    }

}

public class questao3 {
    public static void main(String args[]) {
        // object created with default values for initial quantity and unity price
        StorageProduct sp1  = new StorageProduct("nome qualquer", "1231241");
        // object created with user defined initial quantity and unity price
        StorageProduct sp2 = new StorageProduct("another produtct", "218931", 100, 10);
    }
}
