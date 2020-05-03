package uri1098;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double i, j;

        for (i = 0; i <=2.1; i += 0.2) {
            for (j = 1; j <= 3; j++) {
                if ((int) i == i)
                    System.out.printf("I=%.0f J=%.0f\n", i, j + i);
                else
                    System.out.printf("I=%.1f J=%.1f\n", i, j + i);
            }
        }
        i = 2;
        for (j = 1; j <= 3; j++){
            System.out.printf("I=%.0f J=%.0f\n", i, j + i);
        }
    }
}

