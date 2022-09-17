package Inheritance;
// Inheritance in java is a mechanism in which one object acquires all the properties and behaviour
// of parent object.

// it is an important part of OOPs(object oriented programming system)

// types of inheritance in java
// 1. Single inheritance
// 2. multilevel inheritance
// 3. hierarchical inheritance
// 4. multiple inheritance
// 5. hybrid inheritance

public class automobile {
    private double topSpeed;
    private String brandName;
    private String yearOfManu;
    private double cost;
    private double durability;
    
    public automobile() {
    }

    public automobile(double topSpeed, String brandName, String yearOfManu, double cost, double durability) {
        this.topSpeed = topSpeed;
        this.brandName = brandName;
        this.yearOfManu = yearOfManu;
        this.cost = cost;
        this.durability = durability;
    }

    public void movement(){
        System.out.println("Automobile.movement() was called and automobile moves");
    }

    public void speed(int speed){
        System.out.println("the automobile is moving at a speed of " + speed);
    }
}

