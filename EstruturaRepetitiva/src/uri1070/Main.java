package uri1070;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int contador = 0;

        for(int i=x; contador<6; i++){
            if(i % 2 != 0) {
                System.out.println(i);
                contador++;
            }
        }
    }
}
