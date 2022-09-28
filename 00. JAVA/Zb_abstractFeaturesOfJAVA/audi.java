package Zb_abstractFeaturesOfJAVA;

public class audi implements ICar {
    private String yearOfBuilt;
    private boolean engineOn;

    public audi(String yearOfBuilt, boolean engineOn) {
        this.yearOfBuilt = yearOfBuilt;
        this.engineOn = engineOn;
    }

    @Override
    public void engineOnorOff() {
        if(engineOn == true){
            System.out.println("the engine is now on");
        }
        else{
            System.out.println("the engine is off");
        }
    }

    @Override
    public void fuelTankSize() {
        
    }

    @Override
    public void noOfWheels() {
        System.out.println("It has four wheels and stepknee of brand mrf");
    }

    @Override
    public void seatQuality() {
        System.out.println("It has black leather seats");
    }

    @Override
    public void steeringWheel() {
        
    }
    
}
