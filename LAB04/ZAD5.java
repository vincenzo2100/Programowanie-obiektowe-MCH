import java.util.Scanner;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class ZAD5{
        public static BigDecimal  nice(Double k,double n,Float p) throws Exception
        {
            BigDecimal suma= BigDecimal.ZERO;
                for (int i=0;i<n;i++)
                {
                        String poczatkowa= Double.toString(k);
                        BigDecimal x=new BigDecimal(poczatkowa);
                        String alpha= Float.toString(p);
                        BigDecimal procent=new BigDecimal(alpha);
                        BigDecimal procenta=x.multiply(procent);
                        suma = x.add(procenta);
                        k=k+(k*p);
                }
                return  suma.setScale(2, RoundingMode.HALF_UP);
            }

    public static void main(String[] args)throws Exception
    {
        Scanner scan = new Scanner(System.in);
        double kw = scan.nextDouble();
        double ni = scan.nextDouble();
        Float pr = scan.nextFloat();
        System.out.println(nice(kw,ni,pr));
        scan.close();
    }
}