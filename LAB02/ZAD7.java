import java.util.Scanner;

public class ZAD7 {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalną :");
        int n = in.nextInt();
        double[] liczby = new double[n+1];
        for(int i=0;i<n;i++)
        liczby[i]= in.nextInt();
        int licznik=0;

        for(int i=0;i<n;i++)
        {
            if(liczby[i]>0 && liczby[i+1]>0)
            licznik++;
        }

       System.out.println(licznik);
        
}
}
