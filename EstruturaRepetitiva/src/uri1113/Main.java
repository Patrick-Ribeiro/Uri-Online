package Uri1113;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean loop = true;

        while(loop){
            int numero1 = entrada.nextInt();
            int numero2 = entrada.nextInt();

            if(numero1>numero2)
                System.out.println("Decrescente");
            else if(numero2>numero1)
                System.out.println("Crescente");
            else
                break;
        }
    }
}
