package Classes;

public class GrocMarket {
    private String CustName;
    private String CustId;
    private String CustPhNo;
    private double AccBal;
    private String Address;

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
        GrocMarket myAccount = new GrocMarket();
        myAccount.setCustName("kuldeep");
        myAccount.setAccBal(20000.5);
        myAccount.setCustId("#111");
        myAccount.setCustPhNo("88888889999");
        myAccount.setAddress("Delhi");

        myAccount.Shop(30000);

    }
}
