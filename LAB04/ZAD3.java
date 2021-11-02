import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.io.FileInputStream;

public class ZAD3{
        public static int  nice(File x, String c) throws IOException
        {
            FileInputStream t = new FileInputStream(x);
            InputStreamReader inputStreamReader = new InputStreamReader(t);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            int a=0;
            int y=0;
            while((line = bufferedReader.readLine()) != null)
            {
                String str=line;
                for (int i=0;i<str.length();i++)
                {
                    if (str.charAt(i) == c.charAt(0))
                    {
                        int q=i;
                        for (int j=0;j<c.length();j++)
                        {
                            if (str.charAt(q) != c.charAt(a)) {
                                a = 0;
                                continue;
                            }
                            a++;
                            q++;
                            if(q==str.length())
                            {
                                break;
                            }
                        }
                        if(a==c.length()) {
                            y+=1;
                            a=0;
                        }
                        else{
                            a=0;
                        }
                    }
                }
            }
            return y;
        }
    public static void main(String[] args)throws Exception
    {
        File file = new File("AS.txt");
        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();
        System.out.println(nice(file,c));
        scan.close();

    }
}