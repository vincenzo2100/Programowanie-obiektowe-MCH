import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalną :");
        int n = in.nextInt();
        double suma= 0;
        double suma1 = 1;
        for(int i=1;i<=n;i++) {
            suma += i;
            suma1*=i;
        }
        System.out.println(suma);
        System.out.println(suma1);
    }
}
