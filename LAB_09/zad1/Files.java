package zad1;
import java.io.File;

public class Files {
  public static void main(String args[]){
        File file = new File("F:\\Drirs\\basedir"); 
        int max = 0;
        int biggestDir = 0;
        int count = file.list().length;
    
        for(int i=0;i<count;i++){
            File subcatalog = new File("F:\\Drirs\\basedir\\dir"+i);
            int howManyFiles = subcatalog.list().length;
            if(howManyFiles > max){
                max = howManyFiles;
                biggestDir = i;
            }
        }
        System.out.println("Biggest number of files in sudirectory: " + max);
        System.out.println("Number of biggest subdirectory: "+ biggestDir);
      }
}
  
    
    
    
    
    
    
   


  




   