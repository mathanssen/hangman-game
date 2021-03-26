import java.util.Scanner;

public class Game {

    // Properties
    private int currentLevel;
    private Player player;
    private Scanner scanner = new Scanner(System.in);
    private BankOfWords bankOfWords = new BankOfWords();
    private Hangman hangman = new Hangman();
    private Letters letters = new Letters();
    private Word word = new Word();

    // Constructor
    public Game() {
        this.currentLevel = 1;
    }

    // Methods
    public void run() {
        System.out.println("********** WELCOME TO THE HANGMAN GAME **********");
        System.out.println("What is your name ?");
        this.player = new Player(this.scanner.next());
        this.initialScreen(); // Initializes the options for the player
        this.play(); // Starts the game if the player wants to
    }

    // Plays the game
    public void play() {
        this.word.setWord(this.bankOfWords.getCurrentWord()); //
        this.word.convertWordToDashes();
        boolean answerIsCorrect = this.word.checkAnswer();
        while (answerIsCorrect == false) {
            this.printStatus();
            System.out.println(this.player.getName() + ", please type a letter.");
            char letter = this.scanner.next().charAt(0);
            boolean letterAvailable = this.letters.letterAvailable(letter);
            if (letterAvailable == true) {
                this.letters.deleteLetter(letter);
                boolean letterCorrect = this.word.checkLetterInWord(letter);
                if (letterCorrect == true) {
                    this.word.convertDashesToLetters(letter);
                    answerIsCorrect = this.word.checkAnswer();
                    if (answerIsCorrect == true) {
                        System.out.println("THE WORD IS " + bankOfWords.getCurrentWord());
                        this.upgradeLevel();
                    }
                } else {
                    System.out.println("Sorry, the word does not have this letter.");
                    this.letters.addIncorrectLetter(letter);
                    this.player.setAttempts(this.player.getAttempts() - 1);
                    if (this.player.getAttempts() == 1) {
                        System.out.println("BE CAREFUL. IT IS YOUR LAST CHANCE!");
                    } else if (this.player.getAttempts() == 0) {
                        break;
                    }
                }
            } else {
                System.out.println("This letter was already chosen. Please, choose another one.");
            }
        }
        this.gameOver();
    }

    //
    public void upgradeLevel() {
        if (this.currentLevel < 5) {
            this.currentLevel += 1;
            this.player.setAttempts(10);
            this.letters.setMissingLetters(this.letters.generateAlphabet());
            this.letters.resetIncorrectLetters();
            this.bankOfWords.randomWord(this.bankOfWords.getAllWords());
            this.play();
        } else {
            System.out.println("YOU WIN!");
            this.resetSettings();
        }
    }

    public void resetSettings() {
        this.currentLevel = 1;
        this.bankOfWords = new BankOfWords();
        this.player = new Player();
        this.word = new Word();
        this.letters = new Letters();
        this.run();
    }

    public void gameOver() {
        System.out.println("GAME OVER");
        this.resetSettings();
    }

    public void printStatus() {
        System.out.println("******************* HANGMAN GAME *******************");
        System.out.println("Player: " + this.player.getName());
        System.out.println("Current level: " + this.currentLevel);
        System.out.println("Attempts missing: " + this.player.getAttempts());
        System.out.println("Letters available: " + letters.getMissingLetters());
        System.out.println("Incorrect letters: " + letters.getIncorrectLetters());
        System.out.println("Category: " + this.bankOfWords.getCategory());
        System.out.println(" ");
        this.hangman.showHangman(this.player.getAttempts());
        System.out.println(" ");
        System.out.println("WHAT YOU HAVE TO FIGURE OUT: " + word.getDashedWord());
    }

    // First screen of the game, which the player can start the game, see the rules
    // or exit
    public void initialScreen() {
        do {
            String gameOptions = this.player.getName() + ", please choose one of the options below:"
                    + "\n 1. Start the game" + "\n 2. View the rules of the game" + "\n 3. Exit the game";
            System.out.println(gameOptions);
            this.player.setOptionChosen(this.scanner.nextInt());
            if (this.player.getOptionChosen() == 1) {
                this.showCategories();
            } else if (this.player.getOptionChosen() == 2) {
                showRules();
            } else if (this.player.getOptionChosen() == 3) {
                this.exitGame();
            }
        } while (this.player.getOptionChosen() < 1 | this.player.getOptionChosen() > 3);
    }

    // Stop running the program when the player does not want to play anymore
    public void exitGame() {
        System.out.println("SEE YOU!");
        System.exit(1);
    }

    // Show the rules screen, and options like start or exit the game
    public void showRules() {
        do {
            String rules = "********* RULES *********" + "\nGuess letters one at a time to solve the word puzzle"
                    + "\n 1. Start the game" + "\n 2. Exit the game";
            System.out.println(rules);
            this.player.setOptionChosen(this.scanner.nextInt());
            if (this.player.getOptionChosen() == 1) {
                showCategories();
                this.play();
            } else if (this.player.getOptionChosen() == 2) {
                this.exitGame();
            }
        } while (this.player.getOptionChosen() != 1 | this.player.getOptionChosen() != 2);
    }

    // Show the categories and the option to come back to the first screen
    public void showCategories() {
        String options = "Please, press one of the options below:" + "\n 1. Celebrities" + "\n 2. Countries"
                + "\n 3. Food" + "\n 4. Movies" + "\n 5. Sports" + "\n 6. Back to the main screen";
        System.out.println(options);
        this.bankOfWords.generateNextWord();
        if (this.bankOfWords.getCategory().contentEquals("None")) { // If the player does not want to play, come back to
                                                                    // the main screen
            this.initialScreen();
        }
    }
}
