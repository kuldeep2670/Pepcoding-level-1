package OOPencapsulation;

public class Main {
    public static void main(String[] args) {
        atm atm1 = new atm();
        atm1.CustName = "kuldeep";
        atm1.mobileNo = 813033333;
        atm1.AccBal = 1253.5;

        System.out.println("customer name: " + atm1.CustName);
        atm1.AccBal = 12000;
        System.out.println("Account Balance: " + atm1.AccBal);

        atm1.withdraw(100000);
    }
}
