import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.addAll(a);
        c.addAll(b);
        c.set(2,c.get(3));
        c.set(3,c.get(4));
        return c;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        append(a,b);
        System.out.print(append(a,b));
    }
}
