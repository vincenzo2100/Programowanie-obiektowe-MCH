import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class Z2
{

    public static <E> void printWithSemicolon(Iterable<E> sth)
    {
        for(E i: sth)
        {
            System.out.print(i+";");
        }
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> test1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<String> test2 = new ArrayList<>(Arrays.asList("To","jest","egzamin"));
        LinkedList<Integer> test3 = new LinkedList<>(Arrays.asList(10,11,12,13,14,15));
        LinkedList<String> test4 = new LinkedList<>(Arrays.asList("a","to","są","do","niego","testy"));
        
        printWithSemicolon(test1);
        System.out.print("\n");
        printWithSemicolon(test2);
        System.out.print("\n");
        printWithSemicolon(test3);
        System.out.print("\n");
        printWithSemicolon(test4);
    }
}