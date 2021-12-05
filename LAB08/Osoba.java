import java.time.LocalDate;
abstract class Osoba
{
    private String nazwisko;
    String[] imiona;
    LocalDate dataurodzenia;
    boolean plec;

    public Osoba(String nazwisko,String[] imiona,LocalDate dataurodzenia,boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataurodzenia = dataurodzenia;
        this.plec = plec;
    }

    public String[] getImiona(){return this.imiona;}
    public LocalDate getDataurodzenia(){return dataurodzenia;}
    public boolean getPlec(){return plec;}
    public String getNazwisko(){return nazwisko;}
    public abstract String getOpis();

}

class Pracownik extends Osoba
{
    LocalDate dataZatrudnienia;
    public Pracownik(String nazwisko,String[] imiona,LocalDate dataurodzenia,boolean plec, double pobory,LocalDate dataZatrudnienia)
    {
        super(nazwisko,imiona,dataurodzenia,plec);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public LocalDate getDataZatrudnienia(){return dataZatrudnienia;}

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
}

class Student extends Osoba
{
    double sredniaOcen;
    public Student(String nazwisko,String[] imiona,LocalDate dataurodzenia,boolean plec,String kierunek,double sredniaOcen)
    {
        super(nazwisko,imiona,dataurodzenia,plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    public double getSredniaOcen(){return sredniaOcen;}
    public void setSredniaOcen(double sredniaOcen){this.sredniaOcen = sredniaOcen;}
    private String kierunek;
}


