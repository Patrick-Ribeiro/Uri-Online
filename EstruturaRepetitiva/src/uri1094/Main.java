package Uri1094;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdeTestes = entrada.nextInt();
        int qtdeTotalCobaias = 0;
        int qtdeCoelhos = 0;
        int qtdeRatos = 0;
        int qtdeSapos = 0;

        for(int i=0; i<qtdeTestes; i++){
            int qtdeCobaias = 0;
            char tipoCobaia;
            qtdeCobaias = entrada.nextInt(); tipoCobaia = Character.toUpperCase(entrada.next().charAt(0));

            qtdeTotalCobaias += qtdeCobaias;
            switch (tipoCobaia) {
                case 'C':
                    qtdeCoelhos += qtdeCobaias;
                    break;
                case 'R':
                    qtdeRatos += qtdeCobaias;
                    break;
                case 'S':
                    qtdeSapos += qtdeCobaias;
                    break;
                default:
                    break;
            }
        }
 
        System.out.printf("Total: %d cobaias\n", qtdeTotalCobaias);
        System.out.println("Total de coelhos: "+ qtdeCoelhos);
        System.out.println("Total de ratos: "+ qtdeRatos);
        System.out.println("Total de sapos: "+ qtdeSapos);
        
        System.out.printf("Percentual de coelhos: %.2f %%\n", (qtdeCoelhos*1.0/qtdeTotalCobaias)*100);
        System.out.printf("Percentual de ratos: %.2f %%\n", (qtdeRatos*1.0/qtdeTotalCobaias)*100);
        System.out.printf("Percentual de sapos: %.2f %%\n", (qtdeSapos*1.0/qtdeTotalCobaias)*100);
    }
}
