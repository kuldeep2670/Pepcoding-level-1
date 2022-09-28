package Zb_abstractFeaturesOfJAVA;

public class BMW implements ICar{

    private String yearOfBuilt;
    private boolean engineOn;

    public BMW(String yearOfBuilt, boolean engineOn) {
        this.yearOfBuilt = yearOfBuilt;
        this.engineOn = engineOn;
    }

    @Override
    public void engineOnorOff() {
        // TODO Auto-generated method stub
        if(engineOn == true){
            System.out.println("the engine is now on for BMW");
        }
        else{
            System.out.println("the engine is off for BMw");
        }
        
    }

    @Override
    public void fuelTankSize() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void noOfWheels() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void seatQuality() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void steeringWheel() {
        // TODO Auto-generated method stub
        
    }
    
}
