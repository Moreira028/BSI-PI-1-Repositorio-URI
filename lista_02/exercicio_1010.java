#Exercício - 1010

public class Ex11_TerminoLista1 {
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int PECA1 = leitor.nextInt();
        int NPECA1 = leitor.nextInt();
        double VALORUNPECA1 = leitor.nextDouble();
        double VALOR1, VALOR2, TOTAL;
        
        VALOR1 = NPECA1 * VALORUNPECA1;
        
        int PECA2 = leitor.nextInt();
        int NPECA2 = leitor.nextInt();
        double VALORUNPECA2 = leitor.nextDouble();

        VALOR2 = NPECA2 * VALORUNPECA2;

        TOTAL = VALOR1 + VALOR2;
        
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", TOTAL));
        
    }
}

Ferreira, Gabriel. moreira028@.gmail.com

Data: 12/05/2021