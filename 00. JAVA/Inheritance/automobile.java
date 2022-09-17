package Inheritance;
// Inheritance in java is a mechanism in which one object acquires all the properties and behaviour
// of parent object.

// it is an important part of OOPs(object oriented programming system)


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
}

