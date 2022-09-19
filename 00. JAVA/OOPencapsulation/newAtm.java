package OOPencapsulation;

public class newAtm {
    private String CustName;
    private double mobileNo;
    private double custBal;

    public String getCustName() {
        return CustName;
    }
    public void setCustName(String custName) {
        CustName = custName;
    }
    public double getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(double mobileNo) {
        this.mobileNo = mobileNo;
    }
    public double getCustBal() {
        return custBal;
    }
    public void setCustBal(double custBal) {
        this.custBal = custBal;
    }
    public newAtm(String custName, double mobileNo, double Bal) {
        CustName = custName;
        this.mobileNo = mobileNo;
        custBal = Bal;
    }
    public void withdraw(double amount){
        
        if(custBal < amount){
            System.out.println("insufficient amount!!!!!");
        } else{
            custBal = custBal - amount;
            System.out.println("new Balance after withdraw: " + custBal);
        }
    }
}
