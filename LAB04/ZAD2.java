import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.io.FileInputStream;

public class ZAD2{
        public static int  nice(File x, char c) throws IOException
        {
            FileInputStream t = new FileInputStream(x);
            InputStreamReader inputStreamReader = new InputStreamReader(t);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            int a=0;
            while((line = bufferedReader.readLine()) != null)
            {
                String str = line;
                for (int i=0;i<str.length();i++)
                {
                    if(str.charAt(i)==c)
                    {
                        a +=1;
                    }
                }
            }
            return a;
        }
    public static void main(String[] args)throws Exception
    {
        File file = new File("AS.txt");
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        System.out.println(nice(file,c));
        scan.close();

    }
}