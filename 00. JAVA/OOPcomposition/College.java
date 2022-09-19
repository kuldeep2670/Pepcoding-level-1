package OOPcomposition;

public class College {
    private String CollegeName;
    private Library library;
    private Branch branch;
    public College(String collegeName, Library library, Branch branch) {
        CollegeName = collegeName;
        this.library = library;
        this.branch = branch;
    }
    public String getCollegeName() {
        return CollegeName;
    }
    public Library getLibrary() {
        return library;
    }
    public Branch getBranch() {
        return branch;
    }
    public void openingDate(){
        System.out.println("the opening date is: 20 jan");
    }
    
}
