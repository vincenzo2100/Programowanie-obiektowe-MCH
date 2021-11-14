public class ZAD1 {
    
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy();
        RachunekBankowy saver2 = new RachunekBankowy();
        saver1.saldo = 2000;
        saver2.saldo = 3000; 
        RachunekBankowy.setRocznaStopaProcentowa(4);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Nowe oszczędności 1: " + saver1.saldo);
        System.out.println("Nowe oszczędności 2: " + saver2.saldo);
        RachunekBankowy.setRocznaStopaProcentowa(5);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Nowe oszczędności 1: " + saver1.saldo);
        System.out.println("Nowe oszczędności 2: " + saver2.saldo);
    }
}