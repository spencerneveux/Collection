public class Tester {
    public static void main(String[] args) {
        // Testing null constructor
        Part1 p1 = new Part1();

//
//        // Generating values for words in QnotU
//        p1.generateValues("src/QnotU");
//        System.out.println(p1.getValues());
//
//
//        // Importing QnotU into TreeMap & finding time
//        System.out.println(p1.importQT());
//
//        // Importing QnotU into Hashmap & finding time
//        System.out.println(p1.importQH());

        //Testing import scrabble into treemap
        System.out.println(p1.importScrabbleT());

        // Testing generate Values
        p1.generateValues();
        System.out.println(p1.getValues());
    }
}
