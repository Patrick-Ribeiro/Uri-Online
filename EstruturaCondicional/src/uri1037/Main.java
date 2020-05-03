package uri1037;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Declaração de variáveis
        Scanner scan = new Scanner(System.in);
        double numDigitado;
        
        //Entrada de dados
        numDigitado = scan.nextDouble();
        
        //Processamento e saída dados
        if(numDigitado < 0 || numDigitado > 100){
            System.out.println("Fora de intervalo");
        }
        else if(numDigitado >= 0 && numDigitado <= 25.0){
            System.out.println("Intervalo [0,25]"); 
        }
        else if(numDigitado > 25.0 && numDigitado <= 50.0){
            System.out.println("Intervalo (25,50]");
        }
        else if(numDigitado > 50.0 && numDigitado <= 75.0){
            System.out.println("Intervalo (50,75]");
        }
        else if(numDigitado > 75.0 && numDigitado <= 100.0){
            System.out.println("Intervalo (75,100]");
        }              
    }
}