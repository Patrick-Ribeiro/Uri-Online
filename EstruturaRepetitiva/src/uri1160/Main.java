package uri1160;

import java.util.Scanner;

public class Main {

    public static int tempo = 0;
    public static int populacaoA;
    public static int populacaoB;
    public static double crescimentoA;
    public static double crescimentoB;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdeTestes = entrada.nextInt();

        for(int i=0; i<qtdeTestes; i++){
            tempo = 0;
            populacaoA = entrada.nextInt();
            populacaoB = entrada.nextInt();

            crescimentoA = entrada.nextDouble();
            crescimentoB = entrada.nextDouble();

            tempoDeCrescimento();
            if(tempo>100) {
                System.out.println("Mais de 1 seculo.");
            }
            else
                System.out.println(tempo +" anos.");

        }
    }
    private static void tempoDeCrescimento(){
        while(populacaoB>=populacaoA){
            populacaoA += (int) populacaoA*crescimentoA/100;
            populacaoB += (int) populacaoB*crescimentoB/100;

            if(tempo>100)
                break;
            else
                tempo++;
        }
    }
}
