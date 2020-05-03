package uri1066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerosPares = 0;
        int numerosImpares = 0;
        int numerosNegativos = 0;
        int numerosPositivos = 0;

        for(int i=0; i<5; i++){
            int numDigitado = entrada.nextInt();

            if(numDigitado % 2 == 0)
                numerosPares++;
            else
                numerosImpares++;

            if(numDigitado > 0)
                numerosPositivos++;
            else if(numDigitado < 0)
                numerosNegativos++;
        }
        System.out.println(numerosPares +" valor(es) par(es)");
        System.out.println(numerosImpares +" valor(es) impar(es)");
        System.out.println(numerosPositivos +" valor(es) positivo(s)");
        System.out.println(numerosNegativos +" valor(es) negativo(s)");
    }
}
