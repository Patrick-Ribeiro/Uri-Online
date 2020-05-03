package uri1079;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int qtdLoop = entrada.nextInt();
        
        for(int i=0; i<qtdLoop; i++){
            float media=0;
            
            float numero = entrada.nextFloat();
            
            media += numero*2F;
            
            numero = entrada.nextFloat();
            media += numero*3F;
            
            numero = entrada.nextFloat();
            media += numero*5F;
            
            media /= 10F;
            System.out.printf("%.1f\n",media);
        }
    }
}
