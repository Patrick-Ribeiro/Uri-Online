package uri1117;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int notasValidas = 0;
        float media = 0;

        do{
            float nota = entrada.nextFloat();

            if(nota < 0 || nota > 10)
                System.out.println("nota invalida");
            else {
                media += nota;
                notasValidas++;
            }
        }while(notasValidas<2);

        System.out.printf("media = %.2f\n", media/2);
    }
}
