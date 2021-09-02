package zad4;
import java.util.stream.Stream;

public class Zadanie4 {
    private static final String[] IMIONA = {"Anna", "Bogdan", "Karol", "Daniel", "Tomasz", "Beata", "Daniela", "Tomasz", "Jan", "Helena", "Tymoteusz", "Karol", "Roman"};

    public static void main(String[] args) {
        System.out.println("a)");
        Stream.of(IMIONA).filter(s -> s.endsWith("a")).forEachOrdered(System.out::println);
        System.out.println("b)");
        Stream.of(IMIONA).filter(s -> !s.endsWith("a")).distinct().forEachOrdered(System.out::println);
        System.out.println("c)");
        Stream.of(IMIONA).filter(s -> s.length()<6).distinct().forEachOrdered(System.out::println);
        System.out.println("d)");
        Stream.of(IMIONA).filter(s -> !s.endsWith("a")).distinct().forEachOrdered(System.out::println);
        System.out.println("e)");
        Stream.of(IMIONA).sorted().distinct().skip(5).forEachOrdered(System.out::println);
    }

}
