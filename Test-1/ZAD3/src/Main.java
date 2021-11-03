import java.lang.StringBuffer;

public class Main {
    public static String delete(String str,String substr)
    {
        StringBuffer sb = new StringBuffer();
        StringBuffer sub = new StringBuffer();
        sb.append(str);
        sub.append(substr);
        for(int i=0;i<sb.length();i++)
            for(int j=0;j<sub.length();j++)
                if(sb.charAt(i)==sub.charAt(j))
                    sb.deleteCharAt(i);
        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "Rabarbar";
        String substr = "Raba";
        System.out.print(delete(str,substr));

    }
}
