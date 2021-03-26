public class Hangman {

    // Constructor
    public Hangman() {
    }

    // Methods
    // Depending on the attempts of the player, it shows a different picture
    public void showHangman(int attempts) {
        if (attempts == 10) {
            System.out.println("-------------");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|");
            System.out.println("-------------");
        } else if (attempts == 9) {
            System.out.println("-------------");
            System.out.println("|        |   ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|");
            System.out.println("-------------");
        } else if (attempts == 8) {
            System.out.println("-------------");
            System.out.println("|        |   ");
            System.out.println("|        o   ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|");
            System.out.println("-------------");
        } else if (attempts == 7) {
            System.out.println("-------------");
            System.out.println("|        |   ");
            System.out.println("|        o   ");
            System.out.println("|       /    ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|");
            System.out.println("-------------");
        } else if (attempts == 6) {
            System.out.println("-------------");
            System.out.println("|        |   ");
            System.out.println("|        o   ");
            System.out.println("|       /|   ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|");
            System.out.println("-------------");
        } else if (attempts == 5) {
            System.out.println("-------------");
            System.out.println("|        |   ");
            System.out.println("|        o   ");
            System.out.println("|       /|\\ ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|");
            System.out.println("-------------");
        } else if (attempts == 4) {
            System.out.println("-------------");
            System.out.println("|        |   ");
            System.out.println("|        o   ");
            System.out.println("|       /|\\ ");
            System.out.println("|        |   ");
            System.out.println("|            ");
            System.out.println("|            ");
            System.out.println("|");
            System.out.println("-------------");
        } else if (attempts == 3) {
            System.out.println("-------------");
            System.out.println("|        |   ");
            System.out.println("|        o   ");
            System.out.println("|       /|\\ ");
            System.out.println("|        |   ");
            System.out.println("|       /    ");
            System.out.println("|            ");
            System.out.println("|");
            System.out.println("-------------");
        } else if (attempts == 2) {
            System.out.println("-------------");
            System.out.println("|        |   ");
            System.out.println("|        o   ");
            System.out.println("|       /|\\ ");
            System.out.println("|        |   ");
            System.out.println("|       / \\ ");
            System.out.println("|            ");
            System.out.println("|");
            System.out.println("-------------");
        } else if (attempts <= 1) {
            System.out.println("-------------");
            System.out.println("|        |   ");
            System.out.println("|        o   ");
            System.out.println("|       /|\\ ");
            System.out.println("|        |   ");
            System.out.println("|       / \\ ");
            System.out.println("|            ");
            System.out.println("|");
            System.out.println("-------------");
        }
    }
}
