import java.lang.String;

class Adres{
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    String kod_pocztowy;


    public Adres(String ulica,int numer_domu,int numer_mieszkania,String miasto,String kod_pocztowy)
    {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica,int numer_domu,String miasto,String kod_pocztowy)
    {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public static boolean przed(String kod_pocztowy,String kod_pocztowy2)
    {
        for(int i=0;i<6;i++)
       if(kod_pocztowy.equals(kod_pocztowy2))
           return true;
       return false;
    }

    public void pokaz()
    {
        System.out.print("Kod pocztowy: "+this.kod_pocztowy+" Miasto:"+this.miasto+"\n"+" Numer mieszkania: "+this.numer_mieszkania+" Numer domu:"+this.numer_domu+" Ulica:"+this.ulica+"\n");
    }
}


