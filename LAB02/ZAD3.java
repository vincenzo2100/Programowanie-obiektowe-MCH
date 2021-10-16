import java.util.Scanner;

public class ZAD3 {
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
    double[] liczby = new double[n];
    for(int i=0;i<n;i++)
    liczby[i]= in.nextInt();
    
    int liczbaA = 0;
    int liczbaB = 0;
    int liczbaC = 0;
    int liczbaD = 0;
    int liczbaE = 0;
    int liczbaF = 0;
    int liczbaG = 0;
    int liczbaH = 0;

    for(int i=0;i<n;i++)
    {
        if(liczby[i]%2!=0)
        liczbaA++;

        if(liczby[i]%3==0 && liczby[i]%5!=0)
            liczbaB++;
        
        if(liczby[i]*liczby[i]%2==0)
            liczbaC++;

        if(liczby[i]%2!=0 && liczby[i]>0)
            liczbaG++;
    }
    
    for(int i=1;i<n-1;i++)
    {
        if(liczby[i]<(liczby[i-1]+liczby[i+1]/2))
        liczbaD++;

        if(liczby[i]>Math.pow(2,i) && liczby[i]<silnia(i))
        liczbaE++;

        if(i%2!=0 && liczby[i]%2==0)
        liczbaF++;

        if(Math.abs(liczby[i])<Math.pow(i,2));

    }
        


    System.out.println("A)"+liczbaA);
    System.out.println("B)"+liczbaB);
    System.out.println("C)"+liczbaC);
    System.out.println("D)"+liczbaD);
    System.out.println("E)"+liczbaE);
    System.out.println("F)"+liczbaF);
    System.out.println("G)"+liczbaG);
    System.out.println("H)"+liczbaH);
    in.close();
}
}