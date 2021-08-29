package Shops;

public class MainShop {
    public static void main(String[] args) {    
        Bakery bakery = new Bakery("Jowisza","Big ");
        Bookshop bookshop = new Bookshop("Amona","Small ");
        System.out.println(bakery.getInformation());
        System.out.println(bookshop.getInformation());
    }
}
