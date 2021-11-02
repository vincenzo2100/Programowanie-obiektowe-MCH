import java.util.Scanner;
import java.io.*;
import java.math.BigInteger;

public class ZAD4 {
    public static BigInteger  nice(int n) throws Exception
        {
            int a=1;
            BigInteger sum=new BigInteger("0");
            int arr[][]=new int [n][n];
                for (int i=0;i<n;i++)
                {
                    for (int j=0;j<n;j++)
                        {
                            String alpha= Integer.toString(a);
                            BigInteger suma= new BigInteger("0");
                            BigInteger sa=new BigInteger(alpha);
                            suma.add(sa);
                            sum=sum.add(sa);
                            arr[i][j]=a;
                            a*=2;
                        }
                    }
                    return sum;
                }
                public static void main(String[] args)throws Exception
                {
                    Scanner scan = new Scanner(System.in);
                    int n = scan.nextInt();
                    System.out.println(nice(n));
                    scan.close();
                }
}
