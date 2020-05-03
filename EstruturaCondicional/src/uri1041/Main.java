package uri1041;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Declaração de variáveis
        Scanner scan = new Scanner(System.in);
        double cordenadaX, cordenadaY;
        
        //Entrada de dados
        cordenadaX = scan.nextDouble();
        cordenadaY = scan.nextDouble();

        //Processamento e saída de dados
        if(cordenadaX == 0 && cordenadaY == 0){
            System.out.println("Origem");
        }
        else if(cordenadaX == 0 && cordenadaY != 0){
            System.out.println("Eixo Y");           
        }
        else if(cordenadaY == 0 && cordenadaX != 0){
            System.out.println("Eixo X");
        }
        else if(cordenadaX > 0 && cordenadaY > 0){
            System.out.println("Q1");
        }
        else if(cordenadaX < 0 && cordenadaY > 0){
            System.out.println("Q2");
        }
        else if(cordenadaX < 0 && cordenadaY < 0){
            System.out.println("Q3");
        }
        else if(cordenadaX > 0 && cordenadaY < 0){
            System.out.println("Q4");
        }
    }
}
