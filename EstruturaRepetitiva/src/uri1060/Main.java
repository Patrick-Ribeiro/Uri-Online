package Uri1060;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Double numero;
        int contador = 0;
        
        for(int i=0; i<6; i++){
            numero = entrada.nextDouble();
            if(numero>0)
                contador +=1;
        }
        System.out.println(contador +" valores positivos");
    }
}
