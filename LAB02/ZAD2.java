import java.util.Scanner;

public class ZAD2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj liczbe naturalną :");
    int n = in.nextInt();
    double[] liczby = new double[n];
    for(int i=0;i<n;i++)
    liczby[i]= in.nextInt();
    
    for(int i=1;i<n;i++)
    System.out.println(liczby[i]);
    System.out.println(liczby[0]);
    
}
}