import java.util.*;

class Autor implements Comparable<Autor>,Cloneable
{
    private String nazwa;
    private String email;
    private String plec;

    public Autor(String nazwa,String email,String plec)
    {
        this.nazwa = nazwa;
        this.email = email;
        this.plec = plec;
    }

    public String getNazwa(){return this.nazwa;}
    public String getEmail(){return this.email;}
    public String getPlec(){return this.plec;}
    public void setNazwa(String nazwa){this.nazwa=nazwa;}
    public void setEmail(String email){this.email=email;}
    public void setPlec(String email){this.email=email;}
    public int compareTo(Autor other) {return this.nazwa.compareTo(other.nazwa)+this.plec.compareTo(other.plec); }
    public String toString()
    {
        String c = "";
        c+=getClass().getName()+"[nazwisko= "+this.nazwa+" email= "+this.email+" plec= "+this.plec+"\n";
        return c;
    }
}

class Ksiazka implements Comparable<Ksiazka>,Cloneable
{
    private String tytul;
    private String autor;
    private double cena;

    public Ksiazka(String tytul,String autor,double cena)
    {
        this.tytul = tytul;
        this.autor = autor;
        this.cena = cena;
    }

    public int compareTo(Ksiazka other)
    {
        return this.autor.compareTo(other.autor)+this.tytul.compareTo(other.tytul)+Double.compare(this.cena,other.cena);
    }

    public String toString()
    {
        String c = "";
        c+=getClass().getName()+"[nazwisko= "+this.autor+" tytul= "+this.tytul+" cena= "+this.cena+"\n";
        return c;
    }
}


public class Main {
    public static void redukuj(LinkedList<String> pracownicy, int n)
    {
        Iterator<String> bIter =  pracownicy.listIterator();
        int i=1;
        while (bIter.hasNext()) {
            i+=1;
            bIter.next();
            if (bIter.hasNext()&& i==n) {
                bIter.next();
                bIter.remove();
                i=1;
            }
        }
    }

    public static void main(String[] args) {
    ArrayList<Autor> autorzy = new ArrayList<Autor>();
    autorzy.add(new Autor("Kowalski","kowal@wp.pl","mężczyzna"));
    autorzy.add(new Autor("Kowalski","aragafka@wp.pl","mężczyzna"));
    autorzy.add(new Autor("Arbuzowska","jadzia@wp.pl","kobieta"));
    autorzy.add(new Autor("Kaczańska","anka@wp.pl","kobieta"));
    System.out.print(autorzy);
    System.out.print("\n");
    Collections.sort(autorzy);
    System.out.print(autorzy);
    System.out.print("\n");

    ArrayList<Ksiazka> listaksiazek = new ArrayList<Ksiazka>();
    listaksiazek.add(new Ksiazka("Niebo","Kowalski",23.99));
    listaksiazek.add(new Ksiazka("Piekło","Kowalski",31.99));
    listaksiazek.add(new Ksiazka("Woda","Arbuzowska",20.99));
    listaksiazek.add(new Ksiazka("Ziemia","Kaczaska",32.99));
    System.out.print(listaksiazek);
    System.out.print("\n");
    Collections.sort(listaksiazek);
    System.out.print(listaksiazek);
    System.out.print("\n");

    LinkedList<String> ksiazki = new LinkedList<String>();

    ksiazki.add("Niebo");
    ksiazki.add("Piekło");
    ksiazki.add("Woda");
    ksiazki.add("Ziema");
    ksiazki.add("Gaz");
    ksiazki.add("Metal");
    redukuj(ksiazki,2);
    System.out.print(ksiazki);

    
    }
}
