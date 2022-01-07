import java.util.ArrayList;
public class ZAD8 {  
        public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

    list.add("one");
    list.add("two");
    list.add("three");
    print(list);
        
    }
     public static <T> void print (Iterable<T>xd)
    {
        for(T item: xd)
        {
            System.out.print(item+",");
        }
    }
}
