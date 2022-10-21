// // "Abstraction" is the process of hiding the implementation details and showing only functionality to 
// // the user.
// // -->A class which is declared as abstract is known as an "abstract class".
// //    It can have abstract and non-abstract methods.
// //    It needs to be extended and its method implemented. It cannot be instantiated.

package Zb_abstractFeaturesOfJAVA;

abstract class Animal{
    public String Name;
    
    public Animal(String name) {
        Name = name;
    }
    
    public String getName() {
        return Name;
    }

    public abstract void height();
    public abstract void lifeSpan();
    
    
}

class Elephant extends Animal{

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void height() {
        System.out.println("height of an elephant is 3 meters" );
        
    }

    @Override
    public void lifeSpan() {
        System.out.println("lifespan of an elephant is 50 years");
    }
    
}

class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void height() {
        System.out.println("birds have less height");
    }

    @Override
    public void lifeSpan() {
        System.out.println("birds hava low life span");
    }
    public void fly(){
        System.out.println("bird can fly");
    }
    
}

class Sparrow extends Bird{

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("sparrow can fly");
    }
    
}

public class l003_abstractClasses {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("tom");
        elephant.height();
        elephant.lifeSpan();

        Sparrow bird = new Sparrow("mithu");
        bird.height();
        bird.lifeSpan();
        bird.fly();
    }
}
