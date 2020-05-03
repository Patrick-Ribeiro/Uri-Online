package uri1045;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Declaração de variáveis
        Scanner scan = new Scanner(System.in);
        double a,b,c,auxiliar;
        
        //Entrada de dados
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        
        //Coloca o maior valor na variável a
        if(b<a){
            auxiliar = a; a=b; b=auxiliar;
        }
        if(c>a){
            auxiliar=a; a=c; c=auxiliar;
        }
        if(b+c > a){ //Forma triângulo
            if(a*a == b*b + c*c)
                System.out.println("TRIANGULO RETANGULO");
            else if(a*a > b*b + c*c)
                System.out.println("TRIANGULO OBSTUSANGULO");
            else
                System.out.println("TRIANGULO ACUTANGULO");
            if(a==b && a==c)
                System.out.println("TRIANGULO EQUILATERO");
            else if(a==b || a==c || b==c)
                System.out.println("TRIANGULO ISOCELES");
        }
        else
                System.out.println("NAO FORMA TRIANGULO");    
    }
}