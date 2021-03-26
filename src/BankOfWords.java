import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BankOfWords {

    // Properties
    private String category; // Category chosen by the player
    private ArrayList<String> allWords = new ArrayList<String>(); // Array list with all the possible words of the
                                                                  // category chosen
    private ArrayList<String> chosenWords = new ArrayList<String>(); // Array list with all the words that was already
                                                                     // randomly chosen
    private String currentWord; // Currently word randomly chosen
    private Player player = new Player();

    // Constructor
    public BankOfWords() {
    }

    // Methods
    public void addWordToChosenList() {
        this.chosenWords.add(this.currentWord);
    }

    public void generateNextWord() {
        this.generateCategory();
        if (this.player.getCategoryChosen() < 6) {
            this.generateWordsList();
            this.randomWord(this.allWords);
        }
    }

    // Stores the category chosen by the player
    public void generateCategory() {
        Scanner scanner = new Scanner(System.in);
        do {
            this.player.setCategoryChosen(scanner.nextInt());
            if (this.player.getCategoryChosen() == 1) {
                this.category = "Celebrity";
                break;
            } else if (this.player.getCategoryChosen() == 2) {
                this.category = "Country";
                break;
            } else if (this.player.getCategoryChosen() == 3) {
                this.category = "Food";
                break;
            } else if (this.player.getCategoryChosen() == 4) {
                this.category = "Movie";
                break;
            } else if (this.player.getCategoryChosen() == 5) {
                this.category = "Sports";
                break;
            } else if (this.player.getCategoryChosen() == 6) {
                this.category = "None";
                break;
            } else {
                System.out.println("Please, select one of the options");
            }
        } while (this.player.getOptionChosen() < 1 | this.player.getOptionChosen() > 6);
    }

    // Generates an array list of all possible words of the chosen category
    public void generateWordsList() {
        if (this.category == "Celebrity") {
            CelebrityWord celebrity = new CelebrityWord();
            celebrity.addElements(this.allWords);
        } else if (this.category == "Country") {
            CountryWord country = new CountryWord();
            country.addElements((this.allWords));
        } else if (this.category == "Food") {
            FoodWord food = new FoodWord();
            food.addElements(this.allWords);
        } else if (this.category == "Movie") {
            MovieWord movie = new MovieWord();
            movie.addElements(this.allWords);
        } else if (this.category == "Sports") {
            SportWord sports = new SportWord();
            sports.addElements(this.allWords);
        }
    }

    // Randomly Chooses a word from the array list created. It checks if the word
    // was already chosen and loop until chooses a new word
    public void randomWord(ArrayList<String> list) {
        Random random = new Random();
        boolean alreadyChosen = false;
        do {
            this.currentWord = list.get(random.nextInt(list.size()));
            if (this.chosenWords.contains(this.currentWord)) {
                alreadyChosen = true;
            } else {
                alreadyChosen = false;
            }
        } while (alreadyChosen == true);
        this.chosenWords.add(this.currentWord);
    }

    // Empty method only in the parent class
    public void addElements(ArrayList<String> list) {
        ;
    }

    // Getters and Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCurrentWord(String word) {
        this.currentWord = word;
    }

    public String getCurrentWord() {
        return currentWord;
    }

    public ArrayList<String> getAllWords() {
        return allWords;
    }

    public void setAllWords(ArrayList<String> allWords) {
        this.allWords = allWords;
    }

    public ArrayList<String> getChosenWords() {
        return chosenWords;
    }

    public void setChosenWords(ArrayList<String> chosenWords) {
        this.chosenWords = chosenWords;
    }
}
