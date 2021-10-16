import java.util.Scanner;

public class ZAD6 {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalną :");
        int n = in.nextInt();
        double[] liczby = new double[n];
        for(int i=0;i<n;i++)
        liczby[i]= in.nextInt();
        double min=liczby[0];
        double max=liczby[0];

        for(int i=0;i<n;i++)
        {
            if(liczby[i]<min)
                min=liczby[i];
            else if(liczby[i]>max)
                max=liczby[i];
       
        }

        System.out.println("Najwyższa wartość:"+max+"\n"+"Najmniejsza wartość: "+min);
        in.close();
        
}
}
