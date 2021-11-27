public class ZAD3 {
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
}
