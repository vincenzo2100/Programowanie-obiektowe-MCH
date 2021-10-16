import java.util.Scanner;

public class ZAD1 {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 100:");
        int n = in.nextInt();
        int[] liczby = new int[n+1];
       int pA = 0 , 
       npA = 0,
       min = -999,
       max = 999,
       u = 0,
       d =0,
       z=0,
       nl=liczby[0],
       nw=0,
       sumauj=0,
       sumad=0,
       fragment=0;
        
        for(int i=0;i<n;i++)
        liczby[i] = (int)(Math.random()*((max-min)+1))+min;


        for(int i=0;i<n;i++)
        {
            if(liczby[i]>nl)
                nl=liczby[i];
       
        }
        
        for(int i=0;i<n;i++)
        {
            if(liczby[i]%2==0)
            pA++;
            else
            npA++;

            if(liczby[i]<0)
            {
            u++;
            sumauj+=liczby[i];
            liczby[i]=-1;
            }
           

            if(liczby[i]==0)
            z++;

            if(liczby[i]>0)
            {
                d++;
                sumad+=liczby[i];
                liczby[i]=1;
            }
           
            
            if(liczby[i]==nl)
            nw++;

            if(liczby[i]>0 && liczby[i+1]>0)
            fragment++;
            

        }

       

      
        
        System.out.println("A)Parzyste: "+pA+"\n  Nieparzyste: "+ npA);
        System.out.println("B)Dodatnie: "+d+"\n  Zera: "+ z+"\n Ujemne: "+u);
        System.out.println("C)Wystąpienia: "+nw);
        System.out.println("D)Suma dodatnich: "+sumad + "\n Suma ujemnych: " + sumauj);
        System.out.println("E)Długość najdłuższego fragmentu "+fragment);
        System.out.println("F)Tablica po zmianie: ");
        for(int i=0;i<n;i++)
            System.out.print(liczby[i]+" ");
            System.out.print("\n");
            System.out.print("Podaj poczatek przedzialu: ");
            int lewy = in.nextInt();
            System.out.print("Podaj koniec przedzialu: ");
            int prawy = in.nextInt();



            while (lewy < prawy) 
            {
                int pom = liczby[lewy];
                liczby[lewy]  = liczby[prawy];
                liczby[prawy] = pom;
                lewy++;
                prawy--;
                }
            
            System.out.println("G)Tablica po zamianie: ");
            for(int i=0;i<n;i++)
            System.out.print(liczby[i] + " ");
            in.close();


}

} 
