import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Part3 {
    private ArrayList<List<String>> ArrayTeams = new ArrayList<>();
    private LinkedList<List<String>> LinkedTeams = new LinkedList<>();

    /**
     * Method to generate number of teams specified by user input
     * @param n number of teams to generate
     */
    public void generateTeams(int n) {
        for (int i = 0; i < n; i++) {
            ArrayList<String> arrayTeam = new ArrayList<>();
            LinkedList<String> linkedTeam = new LinkedList<>();
            ArrayTeams.add(arrayTeam);
            LinkedTeams.add(linkedTeam);
        }

        System.out.println("The Array Teams are: " + ArrayTeams);
        System.out.println("The linked list teams are: " + LinkedTeams);
    }


    /**
     * Method to load list into each team specified by user
     * @return long value of time taken to load list
     */
    public long loadListArray() {
        long time1, time2;
        time1 = System.currentTimeMillis();
        for (List team : ArrayTeams) {
            try (Scanner in = new Scanner(new File("src/output"))) {
                while (in.hasNextLine()) {
                    String item = in.nextLine();
                    team.add(item);
                }
            }
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        time2 = System.currentTimeMillis();
        return (time2 - time1);
    }



    public ArrayList<List<String>> getArrayTeams() {
        return ArrayTeams;
    }

    public LinkedList<List<String>> getLinkedTeams() {
        return LinkedTeams;
    }

}
