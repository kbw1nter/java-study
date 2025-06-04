package GuessGame;

public class GameLauncher {
    public static void main(String[] args) {
        System.out.println("=== GUESS GAME ===");
        System.out.println("Starting the game...\n");
        
        GuessGame game = new GuessGame();
        game.startGame();
        
        System.out.println("\nThanks for playing!");
    }
}