# Exercício - 1019

public class Ex20 {
   
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int valor, min, sec, hr;
            
            valor = leitor.nextInt();
            
            hr = valor / 3600;
            valor -= hr * 3600;
            min = valor / 60;
            valor -= min * 60;
            
            System.out.println(hr + ":" + min + ":" + valor);
            
            
        }
}

Ferreira, Gabriel. moreira028@.gmail.com

Data: 12/05/2021