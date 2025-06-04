package GuessGame;

public class Player {
    private String name;
    private int guess;
    private boolean isWinner;

    public Player() {
        this.name = " ";
        this.guess = 0;
        this.isWinner = false;
    }

    public Player(String name) {
        this.name = name;
        this.guess = 0;
        this.isWinner = false;
    }
    
    public void Guess() {
        this.guess = (int) (Math.random() * 10);
        System.out.println(name + " guessed: " + guess);
    }

    public int getGuess() {
        return guess;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(Boolean winner) {
        this.isWinner = winner;
    }
}
