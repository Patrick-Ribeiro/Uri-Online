package uri1134;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int clientesAlcool = 0;
        int clientesGasolina = 0;
        int clientesDiesel = 0;
        int numeroDigitado = 0;

        while (numeroDigitado != 4) {
            numeroDigitado = entrada.nextInt();

            switch (numeroDigitado) {
                case 1:
                    clientesAlcool++;
                    break;
                case 2:
                    clientesGasolina++;
                    break;
                case 3:
                    clientesDiesel++;
                    break;
                case 4:
                    break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ clientesAlcool);
        System.out.println("Gasolina: "+ clientesGasolina);
        System.out.println("Diesel: "+ clientesDiesel);
    }
}