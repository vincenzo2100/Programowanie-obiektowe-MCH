import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WordsInHashSetDemo
{
    public static void main(String[] args) throws FileNotFoundException {
        
        Set<String> words = new HashSet<>();
        long totalTime = 0;

        File alicja = new File("E:/alice30.txt");
        Scanner in = new Scanner(alicja);
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }
        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
        in.close();
    }
}