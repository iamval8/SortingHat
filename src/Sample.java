import java.util.Scanner;

public class Sample
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("What fruit would you be?");
        String fruit = scan.nextLine();
        System.out.println(fruit);
    }
}
