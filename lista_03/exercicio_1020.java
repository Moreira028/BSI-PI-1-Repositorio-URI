#Exercício - 1020

public class Ex21_TerminoLista2 {
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int V, A, M, D;
        
        V = leitor.nextInt();
        
        A = V / 365;
        
        M = (V % 365) / 30;
        
        D = (V % 365) % 30;
        
        System.out.println(A + " ano(s)");
        System.out.println(M + " mes(es)");
        System.out.println(D + " dia(s)");
        
    }
}

Ferreira, Gabriel. moreira028@.gmail.com

Data: 12/05/2021