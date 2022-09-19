package OOPcomposition;

public class University {
    private String Name;
    private College college;
    public String getName() {
        return Name;
    }
    public College getCollege() {
        return college;
    }
    public University(String name, College college) {
        Name = name;
        this.college = college;
    }
    
}
