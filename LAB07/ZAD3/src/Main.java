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

public class Main {

    public static void main(String[] args) {
        Osoba os1 = new Osoba("Kowal",1923);
        System.out.print(os1.toString()+"\n");
        Nauczyciel n1 = new Nauczyciel("Celoch",1970,2000);
        System.out.print(n1.toString()+'\n');
        Student s1 = new Student("Kula",2000,"Informatyka");
        System.out.print(s1.toString());

    }
}
