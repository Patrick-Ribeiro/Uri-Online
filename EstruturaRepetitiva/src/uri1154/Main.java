package uri1154;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = 0;
        double media = 0;
        int contador = 0;

        while(idade >= 0){
            idade = entrada.nextInt();
            if(idade < 0)
                break;
            contador++;
            media += idade;
        }
        System.out.printf("%.2f\n",media/contador);
    }
}
