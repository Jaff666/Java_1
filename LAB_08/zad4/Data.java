import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Data {
    public static void main(String[] args) {
        String dateformat;
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Format input: year = yyyy, month = MM,  day = dd, hour = HH minutes = mm, seconds = ss");
        System.out.println("Enter data format: ");
        Scanner scanner = new Scanner(System.in);
        dateformat = scanner.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern(dateformat);
        System.out.println("Your date format: " + date.format(format));   
    }
}

