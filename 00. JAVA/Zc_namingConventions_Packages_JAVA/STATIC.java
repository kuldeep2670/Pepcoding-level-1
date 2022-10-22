package Zc_namingConventions_Packages_JAVA;

public class STATIC {
    public int employeeNo;
    public String name;
    public static String companyName = "Amazon";
    public STATIC(int employeeNo, String name) {
        this.employeeNo = employeeNo;
        this.name = name;
    }

    public void displayDetails(){
        System.out.println("the name is " + this.name +". the emp no is : " + this.employeeNo  + " " + this.companyName);
    }

    public static void main(String[] args) {
        STATIC emp1 = new STATIC(1, "a");
        STATIC emp2 = new STATIC(2, "b");

        emp1.displayDetails();
        emp2.displayDetails();
    }

}
