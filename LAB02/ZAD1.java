import java.util.Scanner;

public class ZAD1 {
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

        double sumaA=0;
        double sumaC=0;
        double sumaD=0;
        double sumaF=0;
        double sumaG=0;
        double iloczynB=1;
        double iloczynE=1;
        double iloczynG=1;
        double roznicaH= 0;
        double roznicaI = 0;

        for(int i=0;i<n;i++)
        {
            sumaA+=liczby[i];
            iloczynB*=liczby[i];
            sumaC+=Math.abs(liczby[i]);
            sumaD+=Math.sqrt(Math.abs(liczby[i]));
            iloczynE*=Math.abs(liczby[i]);
            sumaF+=Math.pow(liczby[i],2);
            sumaG+=liczby[i];
            iloczynG*=liczby[i];
            roznicaH-=Math.pow(-1,i+2)*liczby[i];
            roznicaI-=(Math.pow(-1,i+1)*liczby[i])/(silnia(i+1));
            

        }
        

        System.out.println("A)"+sumaA);
        System.out.println("B)"+iloczynB);
        System.out.println("C)"+sumaC);
        System.out.println("D)"+sumaD);
        System.out.println("E)"+iloczynE);
        System.out.println("F)"+sumaF);
        System.out.println("G)"+sumaG +'\n' + iloczynG);
        System.out.println("H)"+roznicaH);
        System.out.println("I)"+roznicaI);
        in.close();
    }
}