package uri1040;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        float nota1, nota2, nota3, nota4, media, notaExame, media2;
        
	Scanner scan =new Scanner(System.in);
	nota1 =scan.nextFloat();
	nota2 =scan.nextFloat();
	nota3 =scan.nextFloat();
	nota4 =scan.nextFloat();

        media =((nota1 * 2)+(nota2 * 3)+(nota3 * 4)+(nota4 * 1))/10;
		
        if (media >= 7.0) {
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno aprovado.");	 
        }
        else if (media >= 5.0 && media <= 6.9) {
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno em exame.");
            notaExame =scan.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",notaExame);
            media2 =(media + notaExame) / 2;
            if (media2 >= 5.0) {
                System.out.println("Aluno aprovado.");	
            }
            else {
                System.out.println("Aluno reprovado.");
            }	
            System.out.printf("Media final: %.1f\n",media2);		
        }	
        else if (media < 5.0) {
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno reprovado.");	
        }
    }
}