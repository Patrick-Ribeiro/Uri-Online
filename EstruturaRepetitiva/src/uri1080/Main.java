package uri1080;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0, posicao = 0;

        for (int i = 1; i <= 100; i++) {
            int numeroDigitado = entrada.nextInt();

            if (maior < numeroDigitado) {
                posicao = i;
                maior = numeroDigitado;
            }
        }
            System.out.print(maior + "\n" + posicao + "\n");
    }
}