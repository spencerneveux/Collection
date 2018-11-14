import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        mainMenu();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter choice: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1. TreeMap\n2. HashMap");
                int option = in.nextInt();
                if (option == 1)
                    part1TreeMap();
                else if (option == 2)
                    part1Hashmap();
                else
                    System.out.println("Not valid option");
                break;
            case 2:
                System.out.println("1. HashSet\n2. TreeSet");
                int option2 = in.nextInt();
                if (option2 == 1)
                    part2HashSet();
                else if (option2 == 2)
                    part2TreeSet();
                else
                    System.out.println("Not valid option");
                break;
            case 3:
                System.out.println("1. ArrayList\n2. LinkedList");
                int option3 = in.nextInt();
                if (option3 == 1)
                    part3ArrayList();
                else if (option3 == 2)
                    part3LinkedList();
                else
                    System.out.println("Not valid option");
                break;
                default:
                    System.out.println("You must choose valid option");
                    break;

        }
    }

    public static void mainMenu() {
        System.out.println("Menu:\n1. Part 1\n2. Part 2\n3. Part 3");
    }

    public static void part1TreeMap() {
        Part1 p1 = new Part1();

        //TreeMap

        // Importing QnotU into TreeMap & finding time
        System.out.println("Time to import data into TreeMap: " + p1.importTree());

        //Testing import scrabble into treemap
        System.out.println("Time to import scrabble into TreeMap: " + p1.importScrabbleT());

        // Testing generate Values
        System.out.println("Time to search TreeMap: " + p1.generateValuesTreeMap());
        p1.printTreeMap();
    }

    public static void part1Hashmap() {
        // Testing null constructor
        Part1 p1 = new Part1();


        //Hash Map
        // Importing QnotU into Hashmap & finding time
        System.out.println("Time to import data into HashMap: " + p1.importHash());

        //Testing import scrabble into hashmap
        System.out.println("Time to import scrabble into HashMap: " + p1.importScrabbleH());

        //Testing HASHMAP values
        System.out.println("Time to search HashMap: " + p1.generateValuesHashMap());
        p1.printHashMap();
    }


    public static void part2HashSet() {
        //Part 2 hashset
        Part2 p2 = new Part2();
        System.out.println("Time to import into HashSet: " + p2.importHashSet("src/AliceInWonderland"));
        System.out.println("Time to search HashSet: " + p2.searchHash("of"));
    }

    public static void part2TreeSet() {
        //Part 2 Treeset
        Part2 p2 = new Part2();
        System.out.println("Time to import into TreeSet: " + p2.importTreeSet("src/AliceInWonderland"));
        System.out.println("Time to search TreeSet: " + p2.searchTree("of"));
    }

    public static void part3ArrayList() {
        //Part 3
        Part3 p3 = new Part3();
        //ArrayList
        System.out.println("Adding Scavenger hunt to Array List");
        System.out.println("Time taken: " + p3.loadArrayList());
        System.out.println("Iterating through Array List. Time: " + p3.iterateArrayList());

        System.out.println("Enter number of teams: ");
        Scanner in = new Scanner(System.in);
        int numTeams = in.nextInt();
        p3.generateTeams(numTeams);
        System.out.println("Time to load into ArrayList: " + p3.loadTeamArrayList());


        System.out.println("Enter position: ");
        int position = in.nextInt();
        in.nextLine();
        System.out.println("Enter word to insert: ");
        String word = in.nextLine();
        System.out.println("Time taken to find element at position ArrayList: " + p3.searchArrayList(position));

        System.out.println("Time to insert ArrayList: " + p3.insertArrayList(position, word));

        System.out.println("Random time ArrayList: " + p3.randomArrayList());
    }

    public static void part3LinkedList() {
        Part3 p3 = new Part3();
        //Linked List
        System.out.println("Adding Scavenger hunt to Linked List");
        System.out.println("Time taken: " + p3.loadLinkedList());
        System.out.println("Iterating through Linked List. Time: " + p3.iterateLinkedList());
        System.out.println("Enter number of teams: ");
        Scanner in = new Scanner(System.in);
        int numTeams = in.nextInt();
        p3.generateTeams(numTeams);

        System.out.println("Time to load into LinkedList: " + p3.loadTeamLinkedList());

        System.out.println("Enter position: ");
        int position = in.nextInt();
        in.nextLine();
        System.out.println("Enter word to insert: ");
        String word = in.nextLine();
        System.out.println("Time taken to find element at position LinkedList: " + p3.searchLinkedList(position));

        System.out.println("Random time LinkedList: " + p3.randomLinkedList());
    }
}
