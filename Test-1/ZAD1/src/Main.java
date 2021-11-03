import java.util.Scanner;

public class Main {

    public static int isPrime(int n)
    {
        if (n <= 1)
            return 0;
        else if (n == 2)
            return 1;
        else if (n % 2 == 0)
            return 0;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    public static int findPrimes(int[] list)
    {
        int count=0;
        for(int i=0;i<list.length;i++)
            if (isPrime(list[i])==1)
                count++;
        return count;


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++)
            array[i]=in.nextInt();
        System.out.print("Ilość liczb pierwszych to: " + findPrimes(array));
    }
}
