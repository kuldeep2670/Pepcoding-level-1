package OOP;

public class l004_static_vs_Instance_variable {
    public static String name; // for static only one time memory is allocated 
                               // but for instance var everytime new memory is allocated
    
    public l004_static_vs_Instance_variable(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("the name is " + name);
    }

    public static void main(String[] args) {
        l004_static_vs_Instance_variable kuldeep = new l004_static_vs_Instance_variable("kuldeep");
        kuldeep.print();
        l004_static_vs_Instance_variable singh = new l004_static_vs_Instance_variable("singh");
        singh.print();
        kuldeep.print();
    }
}
