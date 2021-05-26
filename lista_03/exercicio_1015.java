# Exercício - 1015

public class Ex16 {
   
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            float x1, x2, y1, y2; 
            double DISTANCIA;
        
            x2 = leitor.nextFloat();
            x1 = leitor.nextFloat();
            y2 = leitor.nextFloat();
            y1 = leitor.nextFloat();

            DISTANCIA  = Math.sqrt(Math.pow(x2 - x1,2.0) + Math.pow(y2 - y1,2.0));
        
        
            System.out.println(String.format("%.4f", DISTANCIA));
        }
}

Ferreira, Gabriel. moreira028@.gmail.com

Data: 12/05/2021