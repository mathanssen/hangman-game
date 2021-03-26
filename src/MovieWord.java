import java.util.ArrayList;

public class MovieWord extends BankOfWords {

    // Constructor
    public MovieWord() {
    }

    // Methods
    // Adds all the words of this category to an array list
    @Override
    public void addElements(ArrayList<String> list) {
        list.add("TITANIC");
        list.add("TOY STORY");
        list.add("PARASITE");
        list.add("PINOCCHIO");
        list.add("THE GODFATHER");
    }
}
