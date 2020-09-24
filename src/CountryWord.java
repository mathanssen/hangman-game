import java.util.ArrayList;

public class CountryWord extends BankOfWords {

    // Constructor
    public CountryWord() {}

    // Methods
    // Adds all the words of this category to an array list
    @Override
    public void addElements(ArrayList<String> list) {
        list.add("CANADA");
        list.add("FRANCE");
        list.add("BRAZIL");
        list.add("SOUTH AFRICA");
        list.add("AUSTRALIA");
    }
}
