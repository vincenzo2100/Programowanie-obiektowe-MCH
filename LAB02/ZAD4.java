import java.util.Scanner;

public class ZAD4 {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalną :");
        int n = in.nextInt();
        double[] liczby = new double[n];
        for(int i=0;i<n;i++)
        liczby[i]= in.nextInt();
        
        int suma=0;

        for(int i=0;i<n;i++)
            if(liczby[i]>=0)
            suma+=liczby[i];

        System.out.println("Suma dodatnich liczb wynosi:"+suma*2);
}
}
