package Uri1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        int contador = 0;
        
        for(int i=0; i<5; i++){
            numero = entrada.nextInt();
            if(numero%2==0){
                contador +=1;
            }
        }
        System.out.println(contador +" valores pares"); 
    }
}