package zad4;
import java.util.Comparator;

    public class ImieComparator implements Comparator<Zawodnik> {
        @Override
        public int compare(Zawodnik o1, Zawodnik o2) {
            return o1.getImie().compareTo(o2.getImie());
        }
    }
     
