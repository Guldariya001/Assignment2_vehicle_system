package model;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getType() {
        return "MAGAZINE";
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}

