# Exercício - 1009

public class Ex10 {
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String NOME = leitor.next();
        double SALARIOF = leitor.nextDouble();
        double TOTALV = leitor.nextDouble();
        double SALARIO;
        double COMISSAO;
        
        
        COMISSAO = (TOTALV / 100) * 15;
        SALARIO = SALARIOF + COMISSAO;

        System.out.println("TOTAL = R$ " + String.format("%.2f", SALARIO));
   
    }

}

Ferreira, Gabriel. moreira028@.gmail.com

Data: 12/05/2021