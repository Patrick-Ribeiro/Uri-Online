package uri1038;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Declaração de variáveis
        Scanner scan = new Scanner(System.in);
        int codigoProduto, quantidadeProduto;
        double precoTotal;
        
        //Entrada de dados
        codigoProduto = scan.nextInt();
        quantidadeProduto = scan.nextInt();
        
        //Processamento e saída de dados
        switch (codigoProduto){
            case 1:
                precoTotal = quantidadeProduto * 4.0;
                System.out.printf("Total: R$ %.2f\n", precoTotal);
                break;
            case 2:
                precoTotal = quantidadeProduto * 4.5;
                System.out.printf("Total: R$ %.2f\n", precoTotal);
                break;
            case 3:
                precoTotal = quantidadeProduto * 5.0;
                System.out.printf("Total: R$ %.2f\n", precoTotal);
                break;
            case 4:
                precoTotal = quantidadeProduto * 2.0;
                System.out.printf("Total: R$ %.2f\n", precoTotal);
                break;
            case 5:
                precoTotal = quantidadeProduto * 1.5;
                System.out.printf("Total: R$ %.2f\n", precoTotal);
                break;            
        }
    }
}
