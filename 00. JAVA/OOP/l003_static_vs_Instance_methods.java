package OOP;

public class l003_static_vs_Instance_methods {
    public static void print() { //you can call static method without creating the object
        System.out.println("this is static method");
    }
    public void display(){  // for non-static method you have create the object to call the method
        System.out.println("this is a non static method");
    }

    public static void main(String[] args) {
        print();
        l003_static_vs_Instance_methods ss = new l003_static_vs_Instance_methods();
        ss.display();
        
    }
}
