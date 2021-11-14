import java.util.Collections;
import java.util.ArrayList;
public class ZAD2 {
    public static void main(String[] args) {
      IntegerSet one = new IntegerSet();
      IntegerSet two = new IntegerSet();
      Collections.addAll(one.tab, 1,3,5);
      Collections.addAll(two.tab, 4,5,3);
      System.out.print("Suma mnogościowa wynosi: " + IntegerSet.union(one.tab, two.tab)+"\n");
      System.out.print("Iloczyn mnogościowy wynosi: " + IntegerSet.intersection(one.tab, two.tab)+"\n");
      System.out.print(one.toString()+"\n");
      one.insertElement(21);
      System.out.print(one.toString()+"\n");
      one.deleteElement(5);
      System.out.print(one.toString()+"\n");
      ArrayList<Integer> pom = new ArrayList<Integer>();
      Collections.addAll(pom, 4,5,3);
      two.equals(pom);
     } 

}
