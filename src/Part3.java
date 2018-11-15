

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Part3 {
    private ArrayList<String> ScavengerHuntArrayList = new ArrayList<>();
    private LinkedList<String> ScavengerHuntLinkedList = new LinkedList<>();
    private ArrayList<List<String>> ArrayTeams = new ArrayList<>();
    private LinkedList<List<String>> LinkedTeams = new LinkedList<>();

    /**
     * Method to time array list add function
     * @return long value; time taken to add 100 items to ArrayList
     */
    public long loadArrayList() {
        long time1, time2;
        time1 = System.nanoTime();
        try (Scanner in = new Scanner(new File("src/ScavengerHunt"))) {
            while (in.hasNextLine()) {
                String item = in.nextLine();
                ScavengerHuntArrayList.add(item);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }

    /**
     * Method to time LinkedLIst add functionality
     * @return long value; Time taken to add 100 items to linkedlist
     */
    public long loadLinkedList() {
        long time1, time2;
        time1 = System.nanoTime();
        try (Scanner in = new Scanner(new File("src/ScavengerHunt"))) {
            while (in.hasNextLine()) {
                String item = in.nextLine();
                ScavengerHuntLinkedList.add(item);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }

    /**
     * Method to iterate through arraylist
     * @return time taken to iterate through arraylist
     */
    public long iterateArrayList() {
        long time1, time2;
        time1 = System.nanoTime();
        ListIterator<String> iterator = ScavengerHuntArrayList.listIterator();
        while(iterator.hasNext()) {
            String item = iterator.next();
        }
        while(iterator.hasPrevious()) {
            String item = iterator.previous();
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }

    /**
     * Method to iterate through linked list
     * @return time taken to iterate through linked list
     */
    public long iterateLinkedList() {
        long time1, time2;
        time1 = System.nanoTime();
        ListIterator<String> iterator = ScavengerHuntLinkedList.listIterator();
        while(iterator.hasNext()) {
            String item = iterator.next();
        }
        while(iterator.hasPrevious()) {
            String item = iterator.previous();
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }

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
     * @return time taken for arraylist to complete method
     */
    public long loadTeamArrayList() {
        long time1, time2;
        time1 = System.nanoTime();
        for (List team : ArrayTeams) {
            try (Scanner in = new Scanner(new File("src/ScavengerHunt"))) {
                while (in.hasNextLine()) {
                    String item = in.nextLine();
                    team.add(item);
                    Collections.shuffle(team);
                }
            }
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }


    /**
     * Method to load scavenger hunt into each team
     * @return time for linked list to complete method
     */
    public long loadTeamLinkedList() {
        long time1, time2;
        time1 = System.nanoTime();
        for (List team : LinkedTeams) {
            try (Scanner in = new Scanner(new File("src/ScavengerHunt"))) {
                while(in.hasNextLine()) {
                    String item = in.nextLine();
                    team.add(item);
                    Collections.shuffle(team);
                }
            }
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }

    /**
     * method to find element in array list for all teams
     * @param position index of element to retrieve
     * @return time taken to retrieve element from array list
     */
    public long searchArrayList(int position) {
        long time1, time2;
        time1 = System.nanoTime();
        for (List<String> team: ArrayTeams) {
            String item = team.get(position);
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }

    /**
     * Method to find element from linked list
     * @param position index of element to retrieve
     * @return time taken to retrieve element from linked list
     */
    public long searchLinkedList(int position) {
        long time1, time2;
        time1 = System.nanoTime();
        for (List<String> team: LinkedTeams) {
            String item = team.get(position);
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }

    /**
     * Method to insert element into array list
     * @param position where to insert element
     * @param element new element to be inserted
     * @return time taken to insert element
     */
    public long insertArrayList(int position, String element) {
        long time1, time2;
        time1 = System.nanoTime();
        for (List<String> team: ArrayTeams) {
            team.set(position, element);
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }

    /**
     * Method to insert element into linked list
     * @param position where to insert element
     * @param element new element to be inserted
     * @return time taken to insert element
     */
    public long insertLinkedList(int position, String element) {
        long time1, time2;
        time1 = System.nanoTime();
        for (List<String> team  : LinkedTeams) {
            team.set(position,element);
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }

    /**
     * Method to retrieve random element
     * @return time taken to retrieve element from array list
     */
    public long randomArrayList() {
        long time1, time2;
        time1 = System.nanoTime();
        for (List<String> team : ArrayTeams) {
            int randomNumber = (int)(Math.random() * 100);
            team.get(randomNumber);
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }

    /**
     * Method to retrieve random element
     * @return time taken to retrieve element from linked list
     */
    public long randomLinkedList() {
        long time1, time2;
        time1 = System.nanoTime();
        for (List<String> team : LinkedTeams) {
            int randomNumber = (int)(Math.random() * 100);
            team.get(randomNumber);
        }
        time2 = System.nanoTime();
        return (time2 - time1);
    }

    public ArrayList<List<String>> getArrayTeams() {
        return ArrayTeams;
    }

    public LinkedList<List<String>> getLinkedTeams() {
        return LinkedTeams;
    }

}
