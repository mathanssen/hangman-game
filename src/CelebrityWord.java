import java.util.ArrayList;

public class CelebrityWord extends BankOfWords {

    // Constructor
    public CelebrityWord() {
    }

    // Methods
    // Adds all the words of this category to an array list
    @Override
    public void addElements(ArrayList<String> list) {
        list.add("JUSTIN BIEBER");
        list.add("KEANU REEVES");
        list.add("RYAN REYNOLDS");
        list.add("RYAN GOSLING");
        list.add("DRAKE");
    }
}
