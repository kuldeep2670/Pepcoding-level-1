package Inheritance;
// The syntax of java inheritance
//  class subclass-name extends superclass-name{  //methods and fields  }
public class car extends automobile{
    private String steeringWheel;
    private String moonRoof;
    private String batterySize;
    private String headLamps;
    private String groundClearance;
    
    
    public car(double topSpeed, String brandName, String yearOfManu, double cost, double durability,
            String steeringWheel, String moonRoof, String batterySize, String headLamps, String groundClearance) {
        super(topSpeed, brandName, "2018", 10000000, durability);
        this.steeringWheel = steeringWheel;
        this.moonRoof = moonRoof;
        this.batterySize = batterySize;
        this.headLamps = headLamps;
        this.groundClearance = groundClearance;
    }
    public static void main(String[] args){
        automobile auto = new automobile(200,"land rover", "2018", 2000000, 10);

        car Car = new car(150, "audi","2019",2000000, 10,"yes","yes", "100kw", "yes","20cm");
        auto.movement();
        Car.movement();
    }
}
