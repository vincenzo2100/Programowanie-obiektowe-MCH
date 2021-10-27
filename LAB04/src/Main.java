import java.util.Scanner;
import java.lang.StringBuffer;
import java.lang.String;

public class Main {
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
        int count=0;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        for(int i=str.length();i>=0;i--)
        {
            if(count==3)
                sb.insert(count,"'");
            count+=3;
        }
        return sb.toString();
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
    }
}
