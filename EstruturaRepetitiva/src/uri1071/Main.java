package uri1071;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numeroFim = entrada.nextInt();
        int numeroInicio = entrada.nextInt();
        int contador = 0;
        
        for(int i=numeroFim-1; i>numeroInicio; i--){
            if(i%2 != 0)
                contador += i;
        }
        System.out.println(contador);
    }
}
