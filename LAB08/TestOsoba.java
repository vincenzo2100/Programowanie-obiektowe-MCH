import java.time.LocalDate;
class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];
        String[] names = {"Jan","Paweł"};
        ludzie[0] = new Pracownik("Kowalski",names,LocalDate.of(2000,2,3),true,2000,LocalDate.of(2020,3,1));
        ludzie[1] = new Student("Kowal",names,LocalDate.of(2000,2,3),true,"Informatyka",4.2);
        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko()+" Urodzony:"+p.getDataurodzenia());
    }
}
}