import java.util.Scanner;

public class ZAD3 {

    public static void generuj(int tab[][],int n,int m,int minWartosc,int maxWartosc)
    {
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
        tab[i][j] = (int)(Math.random()*((maxWartosc-minWartosc)+1))+minWartosc;
    }


    public static void wypisz(int tab[][],int n,int m)
    {
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        System.out.print(tab[i][j] + " ");
        System.out.println();
    }
    }

    static void mnozenie(  int n, int m, int A[][],int n2, int m2, int B[][])
    {
        int i, j, k;
        if (n2 != m) {
 
            System.out.println(
                "\nMnożenie nie możliwe");
            return;
        }
 
        int C[][] = new int[n][m2];
 
        for (i = 0; i < n; i++) {
            for (j = 0; j < m2; j++) {
                for (k = 0; k < n2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
 
        wypisz(C, n, m2);
    }
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 10:");
        int m = in.nextInt();
        int n= in.nextInt();
        int k = in.nextInt();
        int[][] macierz1 = new int[m][n];
        int[][] macierz2 = new int[n][k];
        generuj(macierz1, m, n, 1, 10);
        generuj(macierz2, n, k, 1, 10);
        System.out.println("Macierz A");
        wypisz(macierz1, m, n);
        System.out.println("Macierz B");
        wypisz(macierz2, n, k);
        System.out.println("Macierz C");
        mnozenie(n, m, macierz1, n, k, macierz2);




       
in.close();

}

} 
