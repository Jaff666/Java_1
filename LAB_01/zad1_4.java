import java.util.Scanner;
public class zad1_4 {
    public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    int pointsMax = 0;
    String nameMax = " ";
    System.out.println("Max number of students:");
    int max_students = scanner.nextInt();
    System.out.println(" ");
    
    for(int i=1; i <=  max_students; i++){
        System.out.println("Enter student name:");
        String name = scanner.next();
        System.out.println("Enter student points:");
        int score =  scanner.nextInt();
        System.out.println(" ");

            if(score>pointsMax){
                nameMax = name;
                pointsMax = score;
            }
    }
    System.out.println("Top student name:" + nameMax);
    System.out.println("Top student score:" + pointsMax);
    }
}    

