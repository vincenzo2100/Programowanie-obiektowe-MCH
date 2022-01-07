import java.util.LinkedList;
import java.util.Iterator;


public class ZAD1 {
    public static void redukuj(LinkedList<String> pracownicy, int n)
    {
        Iterator<String> bIter =  pracownicy.listIterator();
        int i=1;
        while (bIter.hasNext()) {
            i+=1;
            bIter.next(); 
            if (bIter.hasNext()&& i==n) {
                bIter.next(); 
                bIter.remove();
                i=1;
            }
        }
    }
    

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Kowalski");    
        ll.add("Brzechwa");   
        ll.add("Dijkstra");    
        ll.add("Bell");    
        ll.add("Osik");
        ll.add("Radowid");
        ll.add("Klekot");
        ll.add("Nowak");
        System.out.print(ll);
        System.out.println();
        redukuj(ll, 2); 
        System.out.print(ll); 
    }
}
