import java.util.Scanner;

public class Test
{
  public static void main(String[] args)
  {
    Scanner keys = new Scanner(System.in);
    System.out.println("Please enter a phrase");
    Phrase myPhrase = new Phrase(keys.nextLine());
    System.out.println("Un-encrypted Phrase: "+myPhrase.getPhrase());
    System.out.println("Please enter a key: ");
    myPhrase.encode(keys.nextLine());
    System.out.println("Encrypted Phrase: "+myPhrase.getPhrase());
    System.out.println("Please enter the key: ");
    myPhrase.decode(keys.nextLine());
    System.out.println("Result: "+myPhrase.getPhrase());
  }
}
