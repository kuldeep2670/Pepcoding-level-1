package OOPcomposition;

public class Sessions {
    private String sessionName;
    private Student student;
    public String getSessionName() {
        return sessionName;
    }
    public Student getStudent() {
        return student;
    }
    public Sessions(String sessionName, Student student) {
        this.sessionName = sessionName;
        this.student = student;
    }
}
