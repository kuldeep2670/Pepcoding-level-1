// A constructor in Java is a special method that is used to initialize objects. 
// The constructor is called when an object of a class is created. 
// It can be used to set initial values for object attributes. 

// Every time an object is created using the new() keyword, atleast one constructor is called.
// this keyword is the first statement in the constructor

// There are two types Constructors in Java.
//  1. Default constructor OR No-argument constructor
//      It calls a default constructor if there is no constructor available in the class. In such case,
//      Java compiler provides a default constructor by default

//  2. Parameterized Constructor

//Rules for constructors
// 1. constructor name must be the same as its class name.
// 2. A constructor must have no explicit return type.
// 3. A java constructor cannot be abstract , static , final and synchronized.

package Classes;

public class GrocMarket {
    private String CustName;
    private String CustId;
    private String CustPhNo;
    private double AccBal;
    private String Address;

    public GrocMarket(){ // default constructor
        
        // if nothing is passes then default values can be set by using this .
        this("DefName", "DefId", "DefNo", 100.0, "India");
        System.out.println("Default Constructor was called");
    }

    public GrocMarket(String CustName, String CustId, String CustPhNo, double AccBal, String Address){ //
        this.CustName = CustName;
        this.CustId = CustId;
        this.CustPhNo = CustPhNo;
        this.AccBal = AccBal;
        this.Address = Address;
        System.out.println("Constructor Called");
    }

    public String getCustName() {
        return CustName;
    }
    public void setCustName(String custName) {
        CustName = custName;
    }
    public String getCustId() {
        return CustId;
    }
    public void setCustId(String custId) {
        CustId = custId;
    }
    public String getCustPhNo() {
        return CustPhNo;
    }
    public void setCustPhNo(String custPhNo) {
        CustPhNo = custPhNo;
    }
    public double getAccBal() {
        return AccBal;
    }
    public void setAccBal(double accBal) {
        AccBal = accBal;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }

    public void Shop(double amount){
        if(AccBal >= amount){
            double remBal = AccBal - amount;
            System.out.println("Thanks for shopping. Your balance amount is " + remBal);
            AccBal = remBal;
        }
        else{
            double lowAmount = amount - AccBal;
            System.out.println("Insufficient Balance!!!. Add more money: " + lowAmount);
        }
    }

    public void rechargeAcc(double recharge){
        AccBal = AccBal + recharge;
        System.out.println("Thanks for recharging. Your new  Balance is " + AccBal);
    }

    public static void main(String[] args){
        GrocMarket myAccount = new GrocMarket("kuldeep","#111","88888889999",20000.5,"Delhi"); 
        // myAccount.setCustName("kuldeep");
        // myAccount.setAccBal(20000.5);
        // myAccount.setCustId("#111");
        // myAccount.setCustPhNo("88888889999");
        // myAccount.setAddress("Delhi");

        myAccount.Shop(30000);

    }
}
