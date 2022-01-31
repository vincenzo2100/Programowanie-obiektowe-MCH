import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Z1
{
    public static void main(String[] args)
    {
        
            ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,1,2,2,5,5,6));
            Collections.sort(test);
            ArrayList<Integer> test2 = new ArrayList<>(Arrays.asList(3,2,3,5,4,5));
            Collections.sort(test2);
            System.out.print(ArrayUtil.removeRepeatedElements(test));
            System.out.print(ArrayUtil.removeRepeatedElements(test2));
        
    }
    }


class ArrayUtil
{
    public static <T> ArrayList<T> removeRepeatedElements(ArrayList<T> tab)
    {
        for(int i=0;i<tab.size()-1;i++)
        if(tab.get(i)==tab.get(i+1))
        tab.remove(i);

        return tab;
    }
}

  