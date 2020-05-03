package uri1044;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Declaração de variáveis
        Scanner scan = new Scanner(System.in);
        int a,b;
        
        //Entrada de dados
        a = scan.nextInt();
        b = scan.nextInt();
        
        //Processamento e saída de dados
        if(b % a == 0 || a % b == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }            
    }
}
