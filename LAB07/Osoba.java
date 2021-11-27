import java.lang.String;

class Osoba {
    public String nazwisko;
    public int   rokUrodzenia;

    public Osoba(String nazwisko,int rokUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String toString()
    {
        String c = String.valueOf(rokUrodzenia)+" "+nazwisko;
        return c;
    }
}

class Student extends Osoba
{
    String kierunek;
    public Student(String nazwisko,int rokUrodzenia,String kierunek)
    {
        super(nazwisko,rokUrodzenia);
       this.kierunek = kierunek;
    }
    public String toString()
    {
        String c = String.valueOf(rokUrodzenia)+" "+nazwisko+" "+kierunek;
        return c;
    }
}

class Nauczyciel extends Osoba
{
    double pensja;
    public Nauczyciel(String nazwisko,int rokUrodzenia,double pensja)
    {
        super(nazwisko,rokUrodzenia);
        this.pensja = pensja;
    }
    public String toString()
    {
        String c = String.valueOf(rokUrodzenia)+" "+nazwisko+" "+pensja;
        return c;
    }
}
