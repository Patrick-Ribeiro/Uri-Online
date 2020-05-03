package uri1042;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Declaração de variáveis
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        
        //Entrada de dados
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        //Processamento e saída de dados
if (a > b && a >c){
            if (b > c){
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
                System.out.println();
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
            else{
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
                System.out.println();
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);  
            }
        }
        else if (b > a && b > c){
            if (a > c){
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
                System.out.println();
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);            
            }
            else{            
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
                System.out.println();
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);           
            }    
        }
        else if( c > a && c > b){
            if(a > b){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
                System.out.println();
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);             
            }
            else{
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println();
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);            
            }
        }
    }
}