package Shops;

public class Shop {
    private String address;
    private String size;
    
    Shop(String address, String size){
        this.address = address;
        this.size = size;
    }
    String getInformation(){
        return "Address: " +  address + " Size: " + size;
    }
    
}
