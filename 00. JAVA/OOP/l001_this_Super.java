// This and Super

// --->The keyword 'super' is used to represent the current instance of a parent class(var and meth).

// --->The keyword 'this' is used to represent the current instance of a class.
//     This is required when we have a parameter with the same name as instance variable

//--> we can use them both anywhere in a class except static areas.

// class Dresscode{
//     private String color;
//     public Dresscode(String color){
//         //this keyword is required , same parameter name as field
//         this.color = color; // we are using 'this' because there is a parameter with the same name
//     }
//     public String getColor(){ // in the getter, we dont have any parameters so the 'this'keyword is optional
//         return color;
//     }
//     public void setColor(String color){
//         this.color = color;
//     }
// }


// use of 'Super'
// class SuperClass{
//     public void displayMethod(){
//         System.out.println("Printed in superclass");
//     }
// }
// class SubClass extends SuperClass{
//     @Override  //'Super' is commonly used with method overriding, when we call a method with same name
//     public void displayMethod(){
//         super.displayMethod();
//         System.out.println("Printed in Subclass");
//     }
// }
// class mainClass{
//     public static void main(String[] args) {
//         SubClass s = new SubClass();
//         s.displayMethod();
//     }
// }


