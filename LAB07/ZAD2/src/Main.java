import java.lang.String;

class Adres{
    String ulica;
    int numer_domu;
    int numer_mieszkania;
    String miasto;
    String kod_pocztowy;

    public static boolean przed(String kd1,String kd2)
    {
        for(int i=0;i<kd1.length();i++)
       if(kd1.charAt(i)==kd2.charAt(2))
           return true;
       return false;
    }

    public Adres(String ulica,int numer_domu,int numer_mieszkania,String miasto,String kod_pocztowy)
    {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres()
    {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz()
    {
        System.out.print("Kod pocztowy: "+this.kod_pocztowy+" Miasto:"+this.miasto+"\n"+" Numer mieszkania: "+this.numer_mieszkania+" Numer domu:"+this.numer_domu+" Ulica:"+this.ulica);
    }
}


public class Main {

    public static void main(String[] args) {
        Adres add1 = new Adres("Tuwima",2,3,"Olsztyn","11-220");
        add1.pokaz();
        Adres add2 = new Adres("Tuwima",1,3,"Olsztyn","10-220");
        System.out.print(Adres.przed(add1.kod_pocztowy,add2.kod_pocztowy));
    }
}
