import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Osoba("Kowalski",LocalDate.of(1999,1,12)));
        grupa.add(new Osoba("Kowalski",LocalDate.of(1998,1,12)));
        grupa.add(new Osoba("Żegota",LocalDate.of(2000,1,11)));
        grupa.add(new Osoba("Bomba",LocalDate.of(2000,1,11)));
        grupa.add(new Osoba("Chomczyk",LocalDate.of(2000,1,17)));
        System.out.print(grupa);
        System.out.print("\n");
        Collections.sort(grupa);
        System.out.print(grupa);
        
    }
    
    
}
