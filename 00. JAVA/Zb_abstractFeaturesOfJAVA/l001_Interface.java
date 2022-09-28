// An Interface in Java programming language is defined as an abstract type used to 
// specify the behavior of a class. An interface in Java is a blueprint of a class.
// A Java interface contains static constants and abstract methods.

//The interface in Java is a mechanism to achieve abstraction.
// There can be only abstract methods in the Java interface, not the method body.
// It is used to achieve abstraction and multiple inheritance in Java.

package Zb_abstractFeaturesOfJAVA;

public class l001_Interface {
    public static void main(String[] args) {
        ICar myNewCar;  //declared your interface
        myNewCar = new audi("2020", false);
        myNewCar.engineOnorOff();
        myNewCar.seatQuality();

        myNewCar = new audi("2019", true);
        myNewCar.engineOnorOff();

        myNewCar = new BMW("2021", false);
        myNewCar.engineOnorOff();


    }
}
