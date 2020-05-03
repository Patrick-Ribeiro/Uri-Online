import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
int num,x=0,cont=0,y=0;

while(cont<=100){
    num=entrada.nextInt();
    
    if(num>x)
    {
    x=num;
    y=cont;
    
    }  
    cont=cont+1;
    }

        System.out.println(x);        
        System.out.println(y);

}}