# Exercício - 1008

public class Ex9 {
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int NUMBER = leitor.nextInt();
        int VHORA = leitor.nextInt();
        double HORAS = leitor.nextDouble();
        double SALARY;
        
        SALARY = HORAS * VHORA;

        System.out.println("NUMBER = " + NUMBER); 
        System.out.println("SALARY = U$ " + String.format("%.2f", SALARY));
    
    }
}

Ferreira, Gabriel. moreira028@.gmail.com

Data: 12/05/2021