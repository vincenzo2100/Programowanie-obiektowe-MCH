import java.util.ArrayList;
import java.util.Arrays;

public class IntegerSet {
    ArrayList<Integer> tab = new ArrayList<Integer>();
    int rozmiar = tab.size();
    boolean[] rep = new boolean[rozmiar];
    
    public IntegerSet()
    {
       Arrays.fill(rep,false);
    }
    
    public boolean[] wypelnienie()
    {
        for(int i=0;i<rozmiar;i++)
        {
            if(tab.get(i)>=1&&tab.get(i)<=100)
            rep[i]=true;
            else
            rep[i]=false;
        }
        return rep;
    }
    public static ArrayList<Integer> union(ArrayList<Integer> tab1,ArrayList<Integer> tab2)
    {
        ArrayList<Integer> tab3 = new ArrayList<Integer>();
        tab3.addAll(tab1);
        tab3.addAll(tab2);
        return tab3;     
    }

    public static ArrayList<Integer> intersection(ArrayList<Integer> tab1,ArrayList<Integer> tab2)
    {
        tab1.retainAll(tab2);
        return tab1;
    }

    public void insertElement(int n)
    {
       tab.add(n);
    }

    

    public void deleteElement(int n)
    {
        int index = 0;
        for(int i=0;i<tab.size();i++)
        if(tab.get(i)==n)
        index = i;
        tab.remove(index);
        

    }

    public String toString()
    { 
       String pom = tab.toString();
  
       pom = pom.replace("[","").replace("]","").replace("", "").replace(",",""); 
       return pom.toString();
    }

    public void equals(ArrayList<Integer> tab1)
    {
        if(tab1.equals(tab)==true)
        System.out.print("Zbiory identyczne" + "\n");
        else
        System.out.print("Zbiory nie identyczne" + "\n");
    }
    
}
