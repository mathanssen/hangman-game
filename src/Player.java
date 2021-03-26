public class Player {

    // Properties
    private String name;
    private int attempts;
    private int optionChosen;
    private int categoryChosen;

    // Constructor
    public Player() {
    }

    public Player(String name) {
        this.name = name;
        this.attempts = 10;
    }

    // Getters and Setters
    public int getCategoryChosen() {
        return categoryChosen;
    }

    public void setCategoryChosen(int categoryChosen) {
        this.categoryChosen = categoryChosen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void setOptionChosen(int optionChosen) {
        this.optionChosen = optionChosen;
    }

    public int getOptionChosen() {
        return optionChosen;
    }

}
