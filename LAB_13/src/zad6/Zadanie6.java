package zad6;

import java.util.stream.Stream;

public class Zadanie6 {
    private static final String[] IMIONA = {"Anna", "Bogdan", "Karol", "Daniel", "Tomasz", "Beata", "Daniela", "Tomasz", "Jan", "Helena", "Tymoteusz", "Karol", "Roman"};

    public static void main(String[] args) {
        Stream.of(IMIONA)
                .filter(imie -> imie.length() > 6)
                .forEachOrdered(System.out::println);
        Stream.of(IMIONA)
                .peek(System.out::println);
        Stream.of(IMIONA)
                .mapToInt(imie -> imie.length())
                .forEachOrdered(System.out::println);
        Stream.of(IMIONA)
                .peek(System.out::println);
        System.out.println(" ");
        long suma = Stream.of(IMIONA)
                .filter(imie -> imie.length() > 6)
                .peek(System.out::println)
                .mapToInt(imie -> imie.length())
                .peek(System.out::println)
                .summaryStatistics().getSum();
        System.out.println(suma);



    }
}
