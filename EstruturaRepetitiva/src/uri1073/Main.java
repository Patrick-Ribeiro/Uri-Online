package uri1073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numLimite = entrada.nextInt();

        for(int i=1; i<=numLimite; i++){
            if(i%2 ==0)
            System.out.println(i +"^2 = "+ i*i);
        }
    }
}
