package StartupBust;
import java.util.ArrayList;

public class Startup {
    private ArrayList<String> LocationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        LocationCells = loc;
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        int index = LocationCells.indexOf(userInput);
        if (index >= 0) {
            LocationCells.remove(index);
            if (LocationCells.isEmpty()) {
                result = "kill";
                System.out.println("You sunk " + name + " : (");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
