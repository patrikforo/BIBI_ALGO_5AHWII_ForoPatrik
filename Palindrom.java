
import java.util.Scanner;
public class Palindrom
{

    public static boolean isPalindrom(String s)
    {
        if(s.length() == 0 || s.length() == 1)
          
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
          
            return isPalindrom(s.substring(1, s.length()-1));

       
        return false;
    }

    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Bitte Wort angeben:");
        String x = s.nextLine();
        if(isPalindrom(x))
            System.out.println(x + " ist ein palindrome");
        else
            System.out.println(x + " ist kein  palindrome");
    }
}

