package OOPencapsulation;

public class atm {
    public String CustName;
    public double mobileNo;
    public double AccBal;

    public void withdraw(double amount){
        
        if(AccBal < amount){
            System.out.println("insufficient amount!!!!!");
        } else{
            AccBal = AccBal - amount;
            System.out.println("new Balance after withdraw: " + AccBal);
        }
    }
}
