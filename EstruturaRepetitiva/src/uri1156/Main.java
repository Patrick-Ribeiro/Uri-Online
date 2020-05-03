package uri1156;

public class Main {
    public static void main(String[] args) {
        double s = 1;
        double j = 2;

        for(double i=3; i<=39; i+=2){
            s += i/j;
            j+=j;
        }
        System.out.printf("%.2f\n", s);
    }
}
