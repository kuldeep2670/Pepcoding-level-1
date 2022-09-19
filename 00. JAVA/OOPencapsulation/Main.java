// "Encapsulation" is defined as the wrapping up of data under a single unit. 
// It is the mechanism that binds together code and the data it manipulates. 
// Another way to think about encapsulation is, that it is a protective shield that 
// prevents the data from being accessed by the code outside this shield. 

// 1. Technically in encapsulation, the variables or data of a class is hidden from any other class 
// and can be accessed only through any member function of its own class in which it is declared.

// 2. As in encapsulation, the data in a class is hidden from other classes using the data hiding concept 
// which is achieved by making the members or methods of a class private, and the class is exposed to the
// end-user or the world without providing any details behind implementation using the abstraction concept,
// so it is also known as a combination of data-hiding and abstraction.

// 3. Encapsulation can be achieved by Declaring all the variables in the class as private 
// and writing public methods in the class to set and get the values of variables.

// 4. It is more defined with the setter and getter method.

package OOPencapsulation;
public class Main {
    public static void main(String[] args) {
        // atm atm1 = new atm();
        // atm1.CustName = "kuldeep";
        // atm1.mobileNo = 813033333;
        // atm1.AccBal = 1253.5;

        // System.out.println("customer name: " + atm1.CustName);
        // atm1.AccBal = 12000;
        // System.out.println("Account Balance: " + atm1.AccBal);

        // atm1.withdraw(100000);

        newAtm atm2 = new newAtm("Singh", 999111, 1250.3);
        atm2.withdraw(200);
    }
}
