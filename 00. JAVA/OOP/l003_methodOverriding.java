// Method overriding
// --> method overriding is the process which allows the programmer to have multiple methods with the same
// method name and same types of arguments , but in different classes. It is also an implementation 
// of "Run time polymorphism".


package OOP;
public class l003_methodOverriding {
    public static void add(int a, int b){
        int sum = a+b;
        System.out.println("Parent class method sum: " + sum);
    }
    public static void main(String[] args) {
        l003_methodOverriding tt = new l003_methodOverriding();
        test1 tt1 = new test1();
        tt.add(5,10);
        tt1.add(10,20);
    }
    
}
public class test1 extends l003_methodOverriding{
    public static void add(int a, int b) {
        int sum = a+b;
        System.out.println("child class method sum: " + sum);
    }
}


// pointers for method overriding
// 1. inheritance is a compulsory mechanism that should be executed for performing method overiding
// 2. in method overriding the parent class and the child class have the method with the same name and 
//     same arguements, what differs is the type of object while calling the method.
// 3. if the object of child class is created than the child class method will override the parent class
//    method and vice versa