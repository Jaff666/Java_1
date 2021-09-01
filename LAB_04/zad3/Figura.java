package zadanie2;

public enum Figura{
    Dwa("2 "),
    Trzy("3 "),
    Cztery("4 "),
    Piec("5 "),
    Szesc("6 "),
    Siedem("7 "),
    Osiem("8 "),
    Dziewiec("9 "),
    Dziesiec("10 "),
    Walet("Walet "),
    Dama("Krolowa "),
    Krol("Krol "),
    As("As ");

    private String card;

    Figura(String card){
        this.card = card;
    }
    @Override
    public String toString() {
        return card;
    }
}