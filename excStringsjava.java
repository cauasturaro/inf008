import java.util.Scanner;

class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // String gerada a partir de input do usuário por meio de um objeto scanner que faz uso de um método para pegar input e retornar um String obj. 
        String obj2 = sc.nextLine();
        int hashString = obj2.hashCode(); // método 1
        System.out.println("Hash code da sua string é: " + hashString);

        String hashStr = String.valueOf(hashString); // método 2 (static)
        int length = hashStr.length(); // método 3

        System.out.println("O Hash code tem tamanho: " + length); 
        System.out.println("Os últimos 4 números do hash code são: " + hashStr.subSequence(Math.max(0, length - 4), length)); // método 4
        
        String obj1 = "  teste de um texto   ";
        System.out.println("A String hard-codada com todaS as letras em maiúsculo é: " + obj1.toUpperCase().trim()); // método 5 e 6 aplicados no segundo objeto


        sc.close();
    }    
}