# Exercício - 1017

public class Ex18 {
   
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int T, VM; 
            double D, V;
        
            T = leitor.nextInt();
            VM = leitor.nextInt();
        
            D = T * VM;
            
            V = D / 12;
        
            System.out.println(String.format ("%.3f", V));
        }
}

Ferreira, Gabriel. moreira028@.gmail.com

Data: 12/05/2021