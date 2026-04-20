class GeometryCalculator {

    public GeometryCalculator() {}

    public GeometryCalculator(double x) {
        this();
        System.out.println(x); //just because
    }

    public static double calculateAreaCirculus(double radius){
        return radius * radius * 3.14;
    }

    public static double calculateAreaRetangle(double base, double height) {
        return base * height;
    }

    public static double calculateAreaTriangle(double base, double height) {
        return calculateAreaRetangle(base, height)/2;
    }

    public static double calculateAreaTriangle(double side1, double side2, double side3) {
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    public static double calculatePerimeter(double... sides) {
        double total_sum = 0;
        for (double s : sides) {
            total_sum += s;
        }

        return total_sum;
    }
}

public class questao3 {
    public static void main(String[] args) {
        
    }
}
