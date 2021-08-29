package animals;
public class Cat extends Animal {
    
    public Cat(String name, String color) {
        super(name,color);
    }
    
    public String makeSound(){
        return "Miau, jestem " + this.name + " i jestem " + this.color;
    }
}
