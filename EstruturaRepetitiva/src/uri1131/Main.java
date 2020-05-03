package uri1131;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean novoGrenal = false;
        int qtdeGrenais = 0;
        int totalGolsInter = 0, totalGolsGremio = 0;
        int vitoriasInter = 0, vitoriasGremio = 0, empates = 0;

        do{
            qtdeGrenais++;
            int golsInter = entrada.nextInt();
            int golsGremio = entrada.nextInt();

            totalGolsInter += golsInter;
            totalGolsGremio += golsGremio;

            if(golsInter>golsGremio)
                vitoriasInter++;
            else if(golsGremio>golsInter)
                vitoriasGremio++;
            else
                empates++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            int decisao = entrada.nextInt();

            if(decisao == 1)
                novoGrenal = true;
            else if(decisao == 2)
                novoGrenal =false;

        }while(novoGrenal);

        System.out.println(qtdeGrenais +" grenais");
        System.out.println("Inter:"+ vitoriasInter);
        System.out.println("Gremio:"+ vitoriasGremio);
        System.out.println("Empates:"+ empates);

        if(vitoriasInter>vitoriasGremio)
            System.out.println("Inter venceu mais");
        else if(vitoriasGremio>vitoriasInter)
            System.out.println("Gremio venceu mais");
        else
            System.out.println("Nao houve vencedor");
    }
}
