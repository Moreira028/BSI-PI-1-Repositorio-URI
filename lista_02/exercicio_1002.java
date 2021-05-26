# Exercício - 1002

public class Ex3 {
   
    public static void main(String[] args) {
        double raio;
        double n = 3.14159;
        double area;
        Scanner leitor = new Scanner(System.in);
    
        raio = leitor.nextDouble();
    
        area = n * (raio * raio); 
    
        System.out.println("A=" + String.format("%.4f", area)); 
        
    }
}

Ferreira, Gabriel. moreira028@.gmail.com

Data: 12/05/2021