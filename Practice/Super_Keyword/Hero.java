package Super_Keyword;

public class Hero extends Person {
    
    // Super = keyword refers to the superclass (parent) of an object 
    // very similar to the "this" keyword

    // The super keyword in Java is used to refer to members (fields, methods, or constructors) of the superclass (parent class).
    // It’s very commonly used when dealing with inheritance and method overriding.
      
    public String power;

    public Hero(String name, int age, String power) {

        super(name, age);
        // this.name = name;
        // this.age = age;
        this.power = power;
    }

    public String toString() {
        return super.toString() + this.power;
    }
}
