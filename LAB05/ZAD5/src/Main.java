import java.util.ArrayList;


public class Main {
    public static void reverse(ArrayList<Integer> a)
    {
        for(int i=0;i<a.size();i++)
            a.add(i,a.remove(a.size()-1));

        for(int i=0;i<a.size();i++)
            System.out.print(a.get(i)+" ");
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        reverse(a);
    }
}
