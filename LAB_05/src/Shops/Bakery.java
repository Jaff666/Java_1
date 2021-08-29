package Shops;
import java.util.Arrays;

public class Bakery extends Shop {
    private String[] products = {"Bread1", "Bread2" , "Bread3", "Bread4"};
    
    Bakery(String address, String size) {
        super(address,size);
    }

    String getInformation(){
        String info = super.getInformation();
        return info + " Products: " + Arrays.toString(products);
    }
}
