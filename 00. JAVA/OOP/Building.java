package OOP;
// Reference Vs Object Vs Instance Vs Class
// -->A "class" is basically a blueprint of a building using the blueprint, we can build
//    as many as houses as we like based on those plans.

// -->Each building you build(instantiate using the "new" operator) is an object also known as 'instance".

// -->Each house you build has an address(a physical location).In othe words if you want 
//    to tell someone where you live , you give them your address(Perhaps written on a piece of paper).
//    This is known as a "reference"
// -->You can copy that refernce as many times as you like but there is still just one building.
// --> you can pass "references" as 'parametes' to "constructors" and "methods".

// --> In java you always have references to an object in memory
//      there is no way to access an object directly everything is done using a reference.

public class Building {
    private String color;

    public Building(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public static void main(String[] args){
        Building redBuilding = new Building("red");
        Building anotherBuilding = redBuilding;
        System.out.println(redBuilding.getColor());
        System.out.println(anotherBuilding.getColor());

        anotherBuilding.setColor("yellow");
        System.out.println(redBuilding.getColor());
        System.out.println(anotherBuilding.getColor());

        Building greenBuilding = new Building("green");
        anotherBuilding = greenBuilding;
        System.out.println(redBuilding.getColor());
        System.out.println(anotherBuilding.getColor());
        System.out.println(greenBuilding.getColor());
    
    }

}


