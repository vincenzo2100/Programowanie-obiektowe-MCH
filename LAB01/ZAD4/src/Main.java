public class Main {

    public static void main(String[] args) {
        double saldo = 1000;
        double rok1 = saldo+saldo*0.06;
        double rok2 = rok1+rok1*0.06;
        double rok3 = rok2+rok2*0.06;
        System.out.println(rok1);
        System.out.println(rok2);
        System.out.println(rok3);
    }
}
