package uri2313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        if(a<b+c && b<a+c && c<a+b){
            if(a==b && a==c) //Triângulo equilátero
                System.out.println("Valido-Equilatero");
            else if(a==b || a==c || b==c) //Triângulo isóceles
                System.out.println("Valido-Isoceles");
            else //Triângulo escaleno
                System.out.println("Valido-Escaleno");
            
            if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b)
                System.out.println("Retangulo: S");
            else
                System.out.println("Retangulo: N");
        }
        else
            System.out.println("Invalido");
    }
}
