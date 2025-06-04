package GuessGame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p3 = new Player("Player 3");

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Thinking of a number between 0 and 9..");

        while (true) {
            System.out.println("Number to guess: " + targetNumber);

            p1.Guess();
            p2.Guess();
            p3.Guess();

            guessp1 = p1.getGuess();
            System.out.println("Player 1 guessed " + guessp1);
            
            guessp2 = p2.getGuess();
            System.out.println("Player 2 guessed " + guessp2);
            
            guessp3 = p3.getGuess();
            System.out.println("Player 3 guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We hava a winner!");
                System.out.println("Player 1 got it right? " + p1isRight);
                System.out.println("Player 2 got it right? " + p2isRight);
                System.out.println("Player 3 got it right? " + p3isRight);

                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("No right answers! Let's try again.");
            }
        }
    }
}
