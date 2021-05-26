#Exercício - 1013

public class Ex14 {
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A, B, C;
        int MAIORAB, MAIORABC;
    
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
    
        MAIORAB = (A + B + Math.abs(A - B)) / 2;
        MAIORABC = (C + MAIORAB + Math.abs(C - MAIORAB)) / 2;
    
        System.out.println(MAIORABC + " eh o maior" );
    }    
}

Ferreira, Gabriel. moreira028@.gmail.com

Data: 12/05/2021