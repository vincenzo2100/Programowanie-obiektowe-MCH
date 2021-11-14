public class RachunekBankowy {
        static double rocznaStopaProcentowa;
        double saldo;
    
        public void obliczMiesieczneOdsetki()
        {
            double odsetki = (this.saldo*this.rocznaStopaProcentowa)/12;
            this.saldo = this.saldo + odsetki;
        }
    
        public static void setRocznaStopaProcentowa(double stopa)
        {
            RachunekBankowy.rocznaStopaProcentowa = stopa;
        }
    }
    

