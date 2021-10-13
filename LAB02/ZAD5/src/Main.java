import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalną :");
        int n = in.nextInt();
        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;
        for(int i=1;i<=n;i++) {
            if (i > 0)
                dodatnie++;
            if (i < 0)
                ujemne++;
            if (i == 0)
                zera++;
        }
        System.out.println(dodatnie);
        System.out.println(ujemne);
        System.out.println(zera);
    }
}
