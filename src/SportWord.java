import java.util.ArrayList;

public class SportWord extends BankOfWords {

    // Constructor
    public SportWord() {}

    // Methods
    // Adds all the words of this category to an array list
    @Override
    public void addElements(ArrayList<String> list) {
        list.add("SOCCER");
        list.add("BASKETBALL");
        list.add("HOCKEY");
        list.add("VOLLEYBALL");
        list.add("HANDBALL");
    }
}
