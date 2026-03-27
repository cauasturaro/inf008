import java.util.ArrayList;
import java.util.List;


class TestString {
    private String stringObj; //teste de composição

    public TestString(String stringObj){
        this.stringObj = stringObj;
    }

    public void println(){
        System.out.println(stringObj);
    }
    
}

class Product {
    private String name;
    private float price;

    public Product(String name, float price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override      
    public String toString(){
        return name + " - " + String.format("%.2f", price);
    }
}   

class Order {
    private List<Product> products;
    private String deliveryPlace;
    private Status status;
    
    enum Status {
        SUBMITTED,
        PAID, 
        PACKAGED,
        SENT,
        RECEIVED,
        CANCELED;
    }

    public Order(){
        this.products = new ArrayList<>();
        this.status = Status.SUBMITTED;
    }
    
    public void cancelPurchase(){
        status = Status.CANCELED;
    }

    public Status getStatus() {
        return status;
    }
}

public class Aula3POO {
    public static void main(String[] args) {            
        Product p1 = new Product("teste", 3.00f);

        System.out.println(p1);
        p1.setPrice(5.00f);
        System.out.println(p1);

        TestString ts = new TestString("testeee");
        ts.println();
    }

}