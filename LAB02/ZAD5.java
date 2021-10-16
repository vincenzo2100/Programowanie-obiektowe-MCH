import java.util.Scanner;

public class ZAD5 {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalną :");
        int n = in.nextInt();
        double[] liczby = new double[n];
        for(int i=0;i<n;i++)
        liczby[i]= in.nextInt();
        
        int d=0;
        int z=0;
        int u=0;

        for(int i=0;i<n;i++)
        {
            if(liczby[i]>0)
            d++;

            if(liczby[i]==0)
            z++;

            if(liczby[i]<0)
            u++;
        }
            


        System.out.println("Liczba cyfr dodatnich wynosi:"+d+'\n'+"Liczba cyfr ujemnych wynosi:"+u+'\n'+ "Liczba zer wynosi:"+z);
        in.close();
}
}
