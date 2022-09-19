// Composition is a way to design or implement the "has-a" relationship.

// The composition relationship of two objects is possible when one object contains another object
//  and that object is fully dependent on it.

package OOPcomposition;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kuldeep", "117");
        Sessions finalYear = new Sessions("2021", student1);
        Branch ece = new Branch("ECE", finalYear);

        Floor thirdFloor = new Floor("3", 3000);
        Library library1 = new Library("GTBIt", "2002", 1000, thirdFloor);

        College college1 = new College("GTBIT", library1, ece);
        University university1 = new University("GGSIPU", college1);

        university1.getCollege().openingDate();
        university1.getCollege().getLibrary().searchBook();
        university1.getCollege().getLibrary().getFloor().cleantheFloor();
    }
}
// Unversity--> Name, (College)
// College --> CollegeName, (library , branch)
// branch --> BranchName, (Session)
// session --> sessionName , (Student)
// student -->  name, rollno
// library --> name, yearofbuild, noofbooks, (floor)
// floor --> floorno, floorCapacity