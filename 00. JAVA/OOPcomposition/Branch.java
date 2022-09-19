package OOPcomposition;

public class Branch {
    private String BranchName;
    private Sessions session;
    public String getBranchName() {
        return BranchName;
    }
    public Sessions getSession() {
        return session;
    }
    public Branch(String branchName, Sessions session) {
        BranchName = branchName;
        this.session = session;
    }
}
