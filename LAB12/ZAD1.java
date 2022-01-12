import java.util.*;

public class ZAD1{

public static void main(String args[])
{
    
    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    Scanner in3 = new Scanner(System.in);
    int choice;
   
    PriorityQueue<String> kolejka = new PriorityQueue<String>();
  do{
    System.out.print("Lista zadań"+"\n");
    System.out.print("1.Dodaj zadanie"+"\n");
    System.out.print("2.Następne"+"\n");
    System.out.print("3.Wypisz kolejkę"+"\n");
    System.out.print("4.Zakończ"+"\n");
    choice = in.nextInt();

    switch(choice)
    {
        case 1:
        System.out.print("Opis:");
        String opis = in2.nextLine();
        kolejka.add(opis);
        break;

        case 2:
        kolejka.remove();
        break;

        case 3:
        System.out.print("Aktualna lista: "+kolejka + "\n");
        break;

        case 4:
        System.exit(0);
        
    }
    
    }while(choice!=4);

    
    in.close();
    in2.close();
    in3.close();

}
}