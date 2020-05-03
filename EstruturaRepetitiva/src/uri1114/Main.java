package Uri1114;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean loop = true;

        while(loop){
            int senha = entrada.nextInt();

            if(senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            }
            else
                System.out.println("Senha Invalida");
        }
    }
}
