import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalną :");
        int n = in.nextInt();
        double suma = 0;
        for(int i=1;i<=n;i++) {
            double dzialanie = Math.pow(-1, (i + 1)) * i;
            suma += dzialanie;
        }
        System.out.println(suma);
    }
}
