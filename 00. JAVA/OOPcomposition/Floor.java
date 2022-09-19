package OOPcomposition;

public class Floor {
    private String floorNo;
    private double floorCapacity;
    public String getFloorNo() {
        return floorNo;
    }
    public double getFloorCapacity() {
        return floorCapacity;
    }
    public Floor(String floorNo, double floorCapacity) {
        this.floorNo = floorNo;
        this.floorCapacity = floorCapacity;
    }

    public void cleantheFloor(){
        System.out.println("cleaning process initiated");
    }
}
