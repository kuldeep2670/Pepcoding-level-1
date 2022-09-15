package Classes;

public class School {
    private String StudName;
    private String RollNo;
    private String Standard;
    private String Section;


    public School(){
        this("DefName", "120", "X", "C");
    }

    
    public School(String studName, String rollNo) {
        this(studName, rollNo, "IX","D");
    }
    
    public School(String studName, String rollNo, String standard, String section) {
        StudName = studName;
        RollNo = rollNo;
        Standard = standard;
        Section = section;
    }

    public String getStudName() {
        return StudName;
    }
    public void setStudName(String studName) {
        StudName = studName;
    }
    public String getRollNo() {
        return RollNo;
    }
    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }
    public String getStandard() {
        return Standard;
    }
    public void setStandard(String standard) {
        Standard = standard;
    }
    public String getSection() {
        return Section;
    }
    public void setSection(String section) {
        Section = section;
    }
    
}
