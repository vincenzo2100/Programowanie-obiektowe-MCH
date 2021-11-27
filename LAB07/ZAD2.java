public class ZAD2 {
    public class Main {

        public static void main(String[] args) {
            Adres add1 = new Adres("Tuwima",2,3,"Olsztyn","11-220");
            add1.pokaz();
            Adres add2 = new Adres("Tuwima",1,"Olsztyn","11-220");
            System.out.print(Adres.przed(add1.kod_pocztowy,add2.kod_pocztowy));
            
            
        }

    }}
