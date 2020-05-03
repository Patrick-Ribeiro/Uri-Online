package uri1165;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdeCasos = entrada.nextInt();

        for(int i=0; i<qtdeCasos; i++){
            int numeroDigitado = entrada.nextInt();

            if(numeroPrimo(numeroDigitado))
                System.out.println(numeroDigitado +" eh primo");
            else
                System.out.println(numeroDigitado + " nao eh primo");
        }
    }
    public static boolean numeroPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}