import java.util.ArrayList;

public class Letters {

    // Properties
    private ArrayList<String> missingLetters;  // Letters that have not been chosen yet
    private ArrayList<String> incorrectLetters = new ArrayList<String>();  // Incorrect letters chosen

    // Constructor
    public Letters() {
        this.missingLetters = generateAlphabet();
    }

    // Methods
    // Deletes a chosen letter from the missing letters array
    public void deleteLetter(char letter) {
        String stringLetter = Character.toString(letter);
        stringLetter = stringLetter.toUpperCase();
        this.missingLetters.remove(stringLetter);
    }

    // Generates the alphabet in the beginning of each level, so the player starts from the zero
    public ArrayList generateAlphabet() {
        ArrayList<String> alphabet = new ArrayList<String>();
        for (char ch = 'A'; ch <= 'Z'; ++ch) {
            String letter = Character.toString(ch);
            alphabet.add(letter);
        }
        return alphabet;
    }

    // If the letter is incorrect, adds the letter to the incorrect letter array list
    public void addIncorrectLetter(char letter) {
        String stringLetter = Character.toString(letter);
        stringLetter = stringLetter.toUpperCase();
        this.incorrectLetters.add(stringLetter);
    }

    // In the beginning of each level, all the elements of the incorrect letters array list are removed
    public void resetIncorrectLetters() {
        this.incorrectLetters.clear();
    }

    // Checks if the letter chosen by the user is available
    public boolean letterAvailable(char letter) {
        boolean isAvailable;
        String stringLetter = Character.toString(letter);
        stringLetter = stringLetter.toUpperCase();
        if (this.missingLetters.contains(stringLetter)) {
            isAvailable = true;
        } else {
            isAvailable = false;
        }
        return isAvailable;
    }

    // Getters and Setters
    public ArrayList<String> getMissingLetters() {
        return missingLetters;
    }

    public void setMissingLetters(ArrayList<String> missingLetters) {
        this.missingLetters = missingLetters;
    }

    public ArrayList<String> getIncorrectLetters() {
        return incorrectLetters;
    }

    public void setIncorrectLetters(ArrayList<String> incorrectLetters) {
        this.incorrectLetters = incorrectLetters;
    }
}
