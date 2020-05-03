package uri1072;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numLoops = entrada.nextInt();
        int numDentroIntervalo = 0;
        int numForaIntervalo = 0;

        for(int i = 0;i < numLoops; i++){
            int numDigitado = entrada.nextInt();

            if(numDigitado >= 10 && numDigitado <= 20)
                numDentroIntervalo++;
            else
                numForaIntervalo++;
        }
        System.out.println(numDentroIntervalo +" in");
        System.out.println(numForaIntervalo +" out");
    }
}