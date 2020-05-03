package Uri1064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double numero;
        double media = 0;
        int contador = 0;
        
        for(int i=0; i<6; i++){
            numero = entrada.nextDouble();
            if(numero>0){
                contador +=1;
                media += numero;
            }
        }
        System.out.println(contador +" valores positivos");
        System.out.printf("%.1f\n",media/contador); 
    }
}