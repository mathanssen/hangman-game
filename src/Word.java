public class Word extends BankOfWords {

    // Properties
    private String word;
    private String dashedWord;

    // Constructor
    public Word() {}

    // Methods
    // Checks if the word does not have dashes anymore. If it doesn't have, so the answer is correct
    public boolean checkAnswer() {
        boolean answer;
        if(this.word.contentEquals(this.dashedWord)) {
            answer = true;
            System.out.println("YOU FIGURED OUT!");
        } else {
            answer = false;
        }
        return answer;
    }

    // Converts the word randomly chosen to underscores ("_")
    public void convertWordToDashes() {
        this.dashedWord = this.word;
        for (int i = 0; i < this.dashedWord.length(); i++) {
            char character = this.dashedWord.charAt(i);
            if (character != ' ') {
                this.dashedWord = this.dashedWord.replace(character, '_');
            }
        }
    }

    // Checks if the letter exists in the word and return a boolean
    public boolean checkLetterInWord(char letter) {
        boolean isCorrect;
        letter = Character.toUpperCase(letter);
        if (this.word.contains(Character.toString(letter))) {
            isCorrect = true;
        } else {
            isCorrect = false;
        }
        return isCorrect;
    }

    // When the user choose a correct word, it converts the dashes to the letters
    public void convertDashesToLetters(char letter) {
        letter = Character.toUpperCase(letter);
        for(int i = 0; i < this.word.length(); i++) {
            if(letter == (this.word.charAt(i))) {
                this.dashedWord = this.dashedWord.substring(0, i)
                        + letter
                        + this.dashedWord.substring(i + 1);
            }
        }
        System.out.println("THE LETTER IS CORRECT!");
        }

    // Getters and Setters
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDashedWord() {
        return dashedWord;
    }

    public void setDashedWord(String dashedWord) {
        this.dashedWord = dashedWord;
    }
}
