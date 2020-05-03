import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        double pa,pb,ca,cb;
        int i,n,t=1;
        
        n = entrada.nextInt();
        
        for(i=0;i<n;i++){
            
            pa = entrada.nextDouble();
        pb = entrada.nextDouble();
        ca = entrada.nextDouble();
        cb = entrada.nextDouble();
        
        ca = (ca/100)+1;
        cb = (cb/100)+1;
        
        while(pb>pa){
            
            pa = (int) pa*ca;
            pb = (int) pb*cb;
            t++;
            if(t>100){
                System.out.println("Mais de 1 seculo.");
                break;
            }
        }
        if(t<=100)
            System.out.println(t+" anos.");
        t=0;
        }
    }      
}