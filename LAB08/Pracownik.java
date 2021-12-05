import java.time.LocalDate;
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