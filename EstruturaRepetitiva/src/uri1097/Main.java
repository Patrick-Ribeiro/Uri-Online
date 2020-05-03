package uri1097;

public class Main {
        public static void main(String[] args) {
        
        int i, j = 3;

        for (i = 1; i <=9; i += 2) {
            int contador = 0;
            for (j+=4; contador<2; j--) {
                System.out.println("I="+ i +" J="+ j);
                contador++;  
            }
            System.out.println("I="+ i +" J="+ j);
        }    
    }
}
