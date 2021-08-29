package zad4;

import java.util.Comparator;

public class MaxPredkoscComparator implements Comparator<Zawodnik> {
    @Override
    public int compare(Zawodnik o1, Zawodnik o2) {
        return o1.getVmax().compareTo(o2.getVmax());
    }
}
