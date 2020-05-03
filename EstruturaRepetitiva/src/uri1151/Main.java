package uri1151;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numAnterior1 = 0, numAnterior2 = 1 ,proximoNum;

        int qtdeNumeros = entrada.nextInt();
        System.out.print(numAnterior1+" "+numAnterior2);

        for(int i=2;i<qtdeNumeros;i++) {
            proximoNum= numAnterior1 + numAnterior2;
            System.out.print(" "+proximoNum);

            numAnterior1 = numAnterior2;
            numAnterior2 = proximoNum;
        }
        System.out.println();
    }
}
