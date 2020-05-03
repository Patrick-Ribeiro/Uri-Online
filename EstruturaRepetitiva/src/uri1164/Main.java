package uri1164;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdeCasos = entrada.nextInt();

        for(int i=0; i<qtdeCasos; i++){
            int somaDivisores = 0;
            int numeroDigitado = entrada.nextInt();

            for(int j = 1; j<numeroDigitado; j++){

                if(numeroDigitado % j == 0)
                    somaDivisores += j;
            }
            if(somaDivisores == numeroDigitado)
                System.out.println(numeroDigitado +" eh perfeito");
            else
                System.out.println(numeroDigitado +" nao eh perfeito");
        }
    }
}
