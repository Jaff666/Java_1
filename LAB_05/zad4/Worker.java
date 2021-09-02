import java.util.Arrays;

public class Worker {
    private int id;
    private String name;
    private String surname;
    private int telephone;
    private int[] date;

    Worker(int id, String name, String surname, int telephone, int... date){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.date = date;
    }

    @Override
    public String toString(){
        return "ID: " + id + " name: " + name + " surname: " + surname + " telephone: " + telephone + " date: " + Arrays.toString(date);
    }
}
