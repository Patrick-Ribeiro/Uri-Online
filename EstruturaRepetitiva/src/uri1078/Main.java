package uri1078;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        
        for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",i,numero,(i*numero));
        }
    }
}
