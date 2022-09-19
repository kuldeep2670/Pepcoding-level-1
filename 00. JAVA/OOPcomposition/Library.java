package OOPcomposition;

public class Library {
    private String name;
    private String yearOfBuild;
    private int noOfBooks;
    private Floor floor;
    public Library(String name, String yearOfBuild, int noOfBooks, Floor floor) {
        this.name = name;
        this.yearOfBuild = yearOfBuild;
        this.noOfBooks = noOfBooks;
        this.floor = floor;
    }
    public String getName() {
        return name;
    }
    public String getYearOfBuild() {
        return yearOfBuild;
    }
    public int getNoOfBooks() {
        return noOfBooks;
    }
    public Floor getFloor() {
        return floor;
    }
    public void searchBook(){
        System.out.println("Book Found");
    }
    
}
