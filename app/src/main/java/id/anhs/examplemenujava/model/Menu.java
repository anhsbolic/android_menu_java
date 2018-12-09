package id.anhs.examplemenujava.model;

public class Menu {

    public int iconResourceId;
    public String title;

    public Menu() {
        // Default constructor required
    }

    public Menu(int iconResourceId, String title) {
        this.iconResourceId = iconResourceId;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
