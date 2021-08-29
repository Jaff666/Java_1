package animals;
public class Dog extends Animal {
    
    public Dog(String name, String color) {
        super(name,color);
    }
    
    
    
    
    public String makeSound(){
        return "Hau, jestem " + this.name + " i jestem " + this.color;
    }
}
