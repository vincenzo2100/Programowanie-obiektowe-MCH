import java.util.ArrayList;


public class Main {
    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.addAll(a);
        for(int i=0;i<c.size();i++)
            c.add(i,c.remove(c.size()-1));
        return c;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        System.out.print(reversed(a));
    }
}
