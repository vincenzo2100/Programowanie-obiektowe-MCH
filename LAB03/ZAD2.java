import java.util.Scanner;

public class ZAD2 {
    public static void wypisz(int tab[],int n)
    {
        for(int i=0;i<n;i++)
        System.out.print(tab[i] + " ");
    }

    public static void generuj(int tab[],int n,int minWartosc,int maxWartosc)
    {
        for(int i=0;i<n;i++)
        tab[i] = (int)(Math.random()*((maxWartosc-minWartosc)+1))+minWartosc;
    }

    public static int ileNieparzystych(int tab[],int n)
    {
        int np=0;
        for(int i=0;i<n;i++)
        if(tab[i]%2!=0)
        np++;

        return np++;
    }
    public static int ileParzystych(int tab[],int n)
    {
        int p=0;
        for(int i=0;i<n;i++)
        if(tab[i]%2==0)
        p++;

        return p++;
    }

    public static int ileDodatnich(int tab[],int n)
    {
        int licznik=0;
        for(int i=0;i<n;i++)
        if(tab[i]>0)
        licznik++;
        return licznik;
    }

    public static int ileUjemnych(int tab[],int n)
    {
        int licznik=0;
        for(int i=0;i<n;i++)
        if(tab[i]<0)
        licznik++;
        return licznik;
    }

    public static int ileZerowych(int tab[],int n)
    {
        int licznik=0;
        for(int i=0;i<n;i++)
        if(tab[i]==0)
        licznik++;
        return licznik;
    }

    public static int ileMaksymalnych(int tab[],int n)
    {
        int nl=tab[0],licznik=0;
        for(int i=0;i<n;i++)
            if(tab[i]>nl)
                nl=tab[i];

        for(int i=0;i<n;i++)
        if(tab[i]==nl)
        licznik++;
        return licznik;
       
    }

    public static int sumaDodatnich(int tab[],int n)
    {
        int suma=0;
        for(int i=0;i<n;i++)
        if(tab[i]>0)
        suma+=tab[i];
        return suma;
    }

    public static int sumaUjemnych(int tab[],int n)
    {
        int suma=0;
        for(int i=0;i<n;i++)
        if(tab[i]<0)
        suma+=tab[i];
        return suma;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[],int n)
    {
        int licznik=0;
        for(int i=0;i<n;i++)
        if(tab[i]>0 && tab[i+1]>0)
           licznik++;
        return licznik;
    }

    public static void signum(int tab[],int n)
    {
        for(int i=0;i<n;i++)
        if(tab[i]>0)
        tab[i]=1;
        else if(tab[i]<0)
        tab[i]=-1;
        wypisz(tab,n);
    }

    public static void odwrocFragment(int tab[],int lewy,int prawy,int n)
    {
        while (lewy < prawy) 
        {
            int pom = tab[lewy];
           tab[lewy]  = tab[prawy];
            tab[prawy] = pom;
            lewy++;
            prawy--;
            }
            wypisz(tab,n);
    }
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 100:");
        int n = in.nextInt();
        int[] liczby = new int[n+1];
        generuj(liczby, n,-999, 999);
        wypisz(liczby,n);
        System.out.println("A)Nieparzyste: "+ ileNieparzystych(liczby, n) + "\n Parzyste: "+ ileParzystych(liczby, n));
        System.out.println("B)Dodatnie: "+ileDodatnich(liczby, n)+"\n  Zera: "+ ileZerowych(liczby, n)+"\n Ujemne: "+ileUjemnych(liczby, n));
        System.out.println("C)Wystąpienia: "+ileMaksymalnych(liczby, n));
        System.out.println("D)Suma dodatnich: "+sumaDodatnich(liczby, n) + "\n Suma ujemnych: " + sumaUjemnych(liczby, n));
        System.out.println("E)Długość najdłuższego fragmentu "+dlugoscMaksymalnegoCiaguDodatnich(liczby, n));
        System.out.println("F)Tablica po zmianie:" ); signum(liczby,n);
        System.out.println("\n" );
        System.out.println("G)Tablica po zamianie: " ); odwrocFragment(liczby, 1, 2,n);
        



       
in.close();

}

} 
