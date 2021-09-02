import java.util.Arrays; 
public class censorship {
    private String[] date;
    private int number1;

    censorship()
    {
        this.date = date;
        this.number1 = number1;
    }

    
    public String delete(int number1, String... date) {
        System.out.println("Original sentence: " + Arrays.toString(date));
        int delete = number1 - 1;
        for(int i = 0; i < date.length; i++) {
            if(delete >= date.length)
                break;
            if(date[delete] != null) {
                date[delete] = "";
            }
            delete = delete + number1;
        }
        System.out.println("New sentence: " + Arrays.toString(date));
        return "";
    }
}
