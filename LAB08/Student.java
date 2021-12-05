import java.time.LocalDate;
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
