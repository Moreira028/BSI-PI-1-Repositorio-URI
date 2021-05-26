# Exercício - 1012

public class Ex13 {
   
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            float A, B, C;
            float area;
            double pi = 3.14159;
            double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

            A = leitor.nextFloat();
            B = leitor.nextFloat();
            C = leitor.nextFloat();
   
            TRIANGULO = A * C / 2;
            CIRCULO = pi * C * C;
            TRAPEZIO = ((A + B) * C / 2);
            QUADRADO = B * B;
            RETANGULO = A * B;
        
            System.out.println("TRIANGULO: " + String.format("%.3f", TRIANGULO));
            System.out.println("CIRCULO: " + String.format("%.3f", CIRCULO));
            System.out.println("TRAPEZIO: " + String.format("%.3f", TRAPEZIO));
            System.out.println("QUADRADO: " + String.format("%.3f", QUADRADO));
            System.out.println("RETANGULO: " + String.format("%.3f", RETANGULO));
            
        }
            
}

Ferreira, Gabriel. moreira028@.gmail.com

Data: 12/05/2021