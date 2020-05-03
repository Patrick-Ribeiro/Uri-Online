package uri1074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdeCasos = entrada.nextInt();

        for(int i = 0; i<qtdeCasos; i++){
            int numero = entrada.nextInt();

            if(numero == 0)
                System.out.println("NULL");

            else if(numero % 2 == 0) {
                System.out.print("EVEN ");
                if(numero<0)
                    System.out.println("NEGATIVE");
                else
                    System.out.println("POSITIVE");
            }
            else if(numero % 2 != 0) {
                System.out.print("ODD ");
                if (numero < 0)
                    System.out.println("NEGATIVE");
                else
                    System.out.println("POSITIVE");
            }
        }
    }
}
