package StartupBust;
import java.util.ArrayList;

public class StartupBust{
    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuess = 0;

    private void setUpGame() {
        Startup one = new Startup();
        one.setName("poniz");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Your goal is to sink three Startups! Poniez, Hacqi and Cabista");
        System.out.println("Try to sink them all in the fewest number of guests");

        for(Startup startup : startups){
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String usarGuess){
        numOfGuess++;
        String result = "miss";

        for(Startup startupToTest : startups){
            result = startupToTest.checkYourself(usarGuess);
            
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                startups.remove(startupToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All Startups are dead. You stock is now worthless!");
        if (numOfGuess <= 18) {
            System.out.println("It took you " + numOfGuess + "guesses.");
            System.out.println("You got out before your option sank!");
        } else {
            System.out.println("Took you long enough. " + numOfGuess + "guesses.");
            System.out.println("Fish are dancing with your options!");
        }
    }
    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }
}