# Exercício - 1011

public class Ex12_ComecoLista2 {
   
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            double raio;
            double pi = 3.14159;
            double VOLUME;
        
            raio = leitor.nextDouble();
        
            VOLUME = (4.0/3) * pi * Math.pow(raio,3); 
        
            System.out.println("VOLUME = " + String.format("%.3f", VOLUME));
            
        }    
}

Ferreira, Gabriel. moreira028@.gmail.com

Data: 12/05/2021