package uri1132;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        int soma = 0;

        if(num1>num2) {
            for (int i = num2; i <= num1; i++) {
                if (i % 13 != 0)
                    soma += i;
            }
        }
        else{
            for (int i = num1; i <= num2; i++) {
                if (i % 13 != 0)
                    soma += i;
            }
        }
        System.out.println(soma);
    }
}
