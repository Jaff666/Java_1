package Shops;
import java.util.Arrays;

public class Bookshop extends Shop {
    private String[] products = {"Book1", "Book2" , "Book3", "Book4"};
    
    Bookshop(String address, String size) {
        super(address,size);
    }
    
    String getInformation(){
        String info = super.getInformation();
        return info + " Products: " + Arrays.toString(products);
    }
}
