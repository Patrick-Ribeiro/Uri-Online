package uri1043;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double a,b,c,perimetroTriangulo,areaTrapezio;
        
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        
        if(a < b+c && b < a+c && c < a+b){
            perimetroTriangulo = a+b+c;
            System.out.printf("Perimetro = %.1f\n",perimetroTriangulo);
        }
        else{
           areaTrapezio = ((a+b)*c)/2;
           System.out.printf("Area = %.1f\n",areaTrapezio);             
        }        
    }
}
