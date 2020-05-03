package uri1118;

import java.util.Scanner;

public class Main {

    public static int notasValidas;
    public static float media;
    public static boolean novoCalculo;
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            do {
                verificarNota(entrada.nextFloat());
            } while (notasValidas < 2);

            System.out.printf("media = %.2f\n", media / 2);

            fazerNovoCalculo();
        }while(novoCalculo);
    }
    public static void verificarNota(float nota){
        if (nota < 0 || nota > 10)
            System.out.println("nota invalida");
        else {
            media += nota;
            notasValidas++;
        }
    }

    public static void fazerNovoCalculo(){
        int decisao;
        boolean loop = false;
        do {
            System.out.println("novo calculo (1-sim 2-nao)");
            decisao = entrada.nextInt();

            switch (decisao) {
                case 1:
                    novoCalculo = true;
                    notasValidas = 0;
                    media = 0;
                    loop = false;
                    break;
                case 2:
                    novoCalculo = false;
                    break;
                default:
                    loop = true;
                    break;
            }
        }while(loop);
    }
}
