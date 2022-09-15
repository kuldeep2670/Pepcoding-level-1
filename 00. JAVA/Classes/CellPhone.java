// A class is a group of objects which have common properties.
// It is a template or blueprint from which objects are created.

// A class in JAVA can contain:
//     Fields
//     Methods
//     Constructors
//     Blocks
//     Nested Class and Interface
package Classes;

public class CellPhone {
    private int Ram;
    private int NoOfCam;
    public String model;
    private String colour;
    private String processor;
    
    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getNoOfCam() {
        return NoOfCam;
    }

    public void setNoOfCam(int noOfCam) {
        NoOfCam = noOfCam;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public static void main(String[] args) {
        CellPhone apple = new CellPhone();
        //CellPhone onePlus = new CellPhone();
        // apple.model = "iphone13";
        apple.setColour("red");
        
        
    }
}




