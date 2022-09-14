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
    public void setModel(String model){
        String ValidModel = model.toLowerCase();
        if(ValidModel.equals("nord")|| ValidModel.equals("7pro")){
            this.model = model;
        }
        else{
            this.model = "unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
    public static void main(String[] args) {
        CellPhone apple = new CellPhone();
        CellPhone onePlus = new CellPhone();
        // apple.model = "iphone13";
        onePlus.setModel("Nor");
        System.out.println("The phone model is " + onePlus.getModel());
        
    }
}




