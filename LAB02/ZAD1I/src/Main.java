import java.util.Scanner;

public class Main {
    public static int silnia(int n) {
        int iloczyn = 1;
        for(int i = 1; i <= n; i++) {
            iloczyn *= i;
        }
        return iloczyn;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalną :");
        int n = in.nextInt();
        double suma= 0;
        for(int i=1;i<=n;i++) {
            double dzialanie = (Math.pow(-1,i)*i)/silnia(i);
            suma+=dzialanie;
        }
        System.out.println(suma);
    }
}
