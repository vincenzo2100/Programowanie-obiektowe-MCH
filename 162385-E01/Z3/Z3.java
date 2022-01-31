import java.io.File;
import java.util.Arrays;

public class Z3
{
    public static String[] get(String path,String extension)
    {
        File directory = new File(path);
        return directory.list((File dir,String name)->{
            String[] nazwy = name.split("\\.");
            return nazwy[nazwy.length-1].equals(extension);
        });
    }

    public static void main(String[] args)
    {
        System.out.print(Arrays.toString(get(".","java")));
    }
}