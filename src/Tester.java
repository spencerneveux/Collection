import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
//        // Testing null constructor
//        Part1 p1 = new Part1();
//
//        // Importing QnotU into TreeMap & finding time
//        System.out.println(p1.importTree());
//
//        // Importing QnotU into Hashmap & finding time
//        System.out.println(p1.importHash());
//
//        //Testing import scrabble into treemap
//        System.out.println(p1.importScrabbleT());
//
//        //Testing import scrabble into hashmap
//        System.out.println(p1.importScrabbleH());
//
        // Testing generate Values
//        p1.generateValuesTreeMap();
//        p1.printTreeMap();

        //Testing HASHMAP values
//        p1.generateValuesHashMap();
//        p1.printHashMap();


//        //Part 2 hashset
//        Part2 p2 = new Part2();
//        System.out.println(p2.importHashSet("src/AliceInWonderland"));
//        System.out.println(p2.searchHash("of"));

        //Part 2 Treeset
//        Part2 p2 = new Part2();
//        System.out.println(p2.importTreeSet("src/AliceInWonderland"));
//        System.out.println(p2.searchTree("of"));


        //Part 3
        Part3 p3 = new Part3();
        System.out.println("Enter number of teams: ");
        Scanner in = new Scanner(System.in);
        int numTeams = in.nextInt();
        p3.generateTeams(numTeams);
        System.out.println("The time to load into arraylist is: " + p3.loadListArray());
        System.out.println(p3.getArrayTeams());
    }
}
