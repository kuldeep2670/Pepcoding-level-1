package OOPcomposition;

public class Student {
    private String Name;
    private String rollNo;
    public String getName() {
        return Name;
    }
    public String getRollNo() {
        return rollNo;
    }
    public Student(String name, String rollNo) {
        Name = name;
        this.rollNo = rollNo;
    }
}
