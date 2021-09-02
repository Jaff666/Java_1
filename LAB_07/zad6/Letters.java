import java.util.Scanner;
import java.util.regex.*;
  
public class Letters {
    public static void main(String[] args)
    {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[AEYOIU]");
        System.out.print("Wpisz slowo: ");
        text = scanner.nextLine();
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) 
        {
            System.out.println(matcher.group());
        }
    }
}
