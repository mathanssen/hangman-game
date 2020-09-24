import java.util.ArrayList;

public class FoodWord extends BankOfWords {

    // Constructor
    public FoodWord() {}

    // Methods
    // Adds all the words of this category to an array list
    @Override
    public void addElements(ArrayList<String> list) {
        list.add("PIZZA");
        list.add("CHICKEN");
        list.add("HAMBURGER");
        list.add("HOT DOG");
        list.add("NACHOS");
    }
}
