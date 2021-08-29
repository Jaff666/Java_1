import java.io.File;
public class zad1 {
  public static void main(String args[]){
    File directory=new File("F:\\Drirs");
    int fileCount=directory.list().length;
    System.out.println("File Count:"+fileCount);
  }
}