package uri1116;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdeDivisoes = entrada.nextInt();

        for(int i =0; i<qtdeDivisoes; i++){
            int num1 = entrada.nextInt();
            int num2 = entrada.nextInt();

            if(num2 ==0)
                System.out.println("divisao impossivel");
            else
                System.out.printf("%.1f\n", num1*1.0/num2);
        }
    }
}
