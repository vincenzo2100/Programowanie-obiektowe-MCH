import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<Student>();
        grupa.add(new Student("Kowalski",LocalDate.of(1999,1,12),4.2));
        grupa.add(new Student("Kowalski",LocalDate.of(1998,1,12),3.21));
        grupa.add(new Student("Żegota",LocalDate.of(2000,1,11),4.53));
        grupa.add(new Student("Bomba",LocalDate.of(2000,1,11),3.45));
        grupa.add(new Student("Chomczyk",LocalDate.of(2000,1,17),4.1));
        System.out.print(grupa);
        System.out.print("\n");
        Collections.sort(grupa);
        System.out.print(grupa);
        
    }
    
    
}

