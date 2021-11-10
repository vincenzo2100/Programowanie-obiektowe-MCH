import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i=0;i<b.size();i++)
        {
            if(i<a.size()) c.add(a.get(i));
            if(i<b.size()) c.add(b.get(i));
        }
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
        System.out.print(merge(a,b));
    }
}
