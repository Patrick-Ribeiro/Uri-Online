package uri1051;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Declaração de variáveis
        Scanner scan = new Scanner(System.in);
        double renda,imposto;
    
        //Entrada de dados
        renda = scan.nextDouble();
        scan.close();
        
        //Processamento e saída de dados
        if(renda >= 0.0 && renda <= 2000.0)
            System.out.println("Isento");
        else if(renda > 2000.0 && renda <= 3000.0){
            imposto = renda * 0.008;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else if(renda > 3000.0 && renda <= 4500.0){
            if(renda > 2000.0 && renda <= 3000.0){
                renda -= 2000.0;
                imposto = renda * 0.008;
                System.out.printf("R$ %.2f\n", imposto);
            }
            else if(renda > 2000.0 && renda > 3000.0){
                renda -= 3000.0;
                imposto = renda * 0.18 + 1000.0 * 0.08;
                System.out.printf("R$ %.2f\n", imposto);
            }
        }
        else if(renda > 4500.0){
            renda -= 4500.0;
            imposto = renda * 0.28 + 1000.0 * 0.08 + 1500.0 * 0.18;                           
            System.out.printf("R$ %.2f\n", imposto);
        }      
    }
}
