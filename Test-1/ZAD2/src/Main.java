import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int min(int[] list)
    {
        int minvalue = list[0],count=0;
        for(int i=0;i<list.length;i++)
            if(minvalue>list[i])
                minvalue = list[i];

        for(int i=0;i<list.length;i++)
            if(list[i]==minvalue)
                count++;
            return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną: ");
        int n = in.nextInt(),min=-50,max=50;
        int[] numbers = new int[n];
        for(int i=0;i<numbers.length;i++)
            numbers[i]= (int)(Math.random()*((max-min)+1))+min;;
        System.out.print("Najmniejszy element występuje: " + min(numbers)+"\n");
        for(int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]);


    }
}
