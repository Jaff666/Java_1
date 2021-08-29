package job;

public class MainWorker {
    public static void main(String[] args) {
        Worker worker = new Worker(1,"Michal","Kalinowski",666999111);
        Worker worker1 = new Worker(1,"Michal","Kalinowski",666999111,20,05,2001);
        System.out.println(worker);
        System.out.println(worker1);
    }
}
