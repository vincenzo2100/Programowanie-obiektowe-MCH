import java.util.Scanner;
import java.lang.StringBuffer;
import java.lang.String;

public class ZAD1 {
    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == c)
                count++;
        return count;
    }

    public static int countSubStr(String str, String subStr) {
        int index = 0, count = 0;
        while (true) {
            index = str.indexOf(subStr, index);
            if (index != -1) {
                count++;
                index += subStr.length();
            } else {
                break;
            }
        }
        return count;
    }

    public static String middle(String str)
    {
        int position,lenght;
        if(str.length()%2==0) {
            position = str.length() / 2 - 1;
            lenght = 2;
        }else
        {
            position = str.length()/2;
            lenght = 1;
        }
        return str.substring(position,position+lenght);
    }

    public static String repeat(String str,int n)
    {
        return new String(new char[3]).replace("\0", str);
    }


    public static int[]  countChar(String str, String c)
    {
        int[] anArray;
        int a=0;
        int b=0;
        anArray = new int [str.length()];
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i) == c.charAt(0))
            {
                int t=i;
                for (int j=0;j<c.length();j++)
                {
                    if (str.charAt(t) != c.charAt(a)) {
                        a = 0;
                        continue;
                    }
                    t++;
                    a++;
                }
                if(a==c.length()) {
                    anArray[i]=1;
                    b++;
                    a=0;
                }
                else{
                    a=0;
                }
            }
        }
        return anArray;
    }
    
    public static  String change(String str)
    {
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        for(int i=0;i<sb.length();i++)
            if (sb.charAt(i)>= 'A' && sb.charAt(i)<= 'Z')
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            else if (sb.charAt(i) >= 'a' && sb.charAt(i)<= 'z')
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));

        return sb.toString();
    }

    public static String nice(String str)
    {
        int a=0;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
            for (int i = str.length(); i >=0; i--)
            {
                if(a==3)
                {
                    sb.insert(i, "`");
                    a=0;
                }
                a++;
            }
            String xd=sb.toString();
            return xd;
    }
    
    public static String nice(String str,int n,char d)
    {
        int a=0;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
            for (int i = str.length(); i >=0; i--)
            {
                if(a==n)
                {
                    sb.insert(i, d);
                    a=0;
                }
                a++;
            }
            String xd=sb.toString();
            return xd;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj tekst 1");
        String str = in.nextLine();
        System.out.println("Podaj tekst 2");
        String subStr = in.nextLine();
        System.out.println("Podaj liczbę");
        int n = in.nextInt();
        System.out.println("Podaj znak");
        char c = in.next().charAt(0);

       System.out.println("Liczba wystąpień wynosi: "+countChar(str,c));
       System.out.println("Liczba wystąpień substr wynosi: " + countSubStr(str,subStr));
       System.out.println("Znak/ki środkowe: " + middle(str));
       System.out.println("Powtórzone słowo: " + repeat(str,n));
       System.out.println("Tekst po zamianie liter: " + change(str));
       System.out.println("Tekst jako liczba: " + nice(str));
       System.out.println("Tekst jako liczba 2: " + nice(str,n,c));

       in.close();
    }
}