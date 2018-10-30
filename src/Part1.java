import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Part1 {
    TreeMap<String, Integer> tmap1, tmap2;
    HashMap<String, Integer> hmap1, hmap2;
    List<Integer> values;

    public Part1() {
        tmap1 = new TreeMap<>();
        tmap2 = new TreeMap<>();
        hmap1 = new HashMap<>();
        hmap2 = new HashMap<>();
        values = new ArrayList<>();
    }

    /**
     * Method to import QnotU file into TreeMap
     * @return long value of time to complete import
     */
    public long importQT() {
        Date today = new Date();
        long time1, time2;
        time1 = System.currentTimeMillis();
        try (Scanner input = new Scanner(new File("src/QnotU"))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                tmap1.put(line, null);
            }
        }
        catch (FileNotFoundException e) {
            e.getMessage();
        }
        time2 = System.currentTimeMillis();
        return (time2 - time1);
    }

    /**
     * Method to import QnotU file into Hashmap
     * @return long value of time to complete import
     */
    public long importQH() {
        Date today = new Date();
        long time1, time2;
        time1 = System.currentTimeMillis();
        try (Scanner input = new Scanner(new File("src/QnotU"))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                hmap1.put(line, null);
            }
        }
        catch (FileNotFoundException e) {
            e.getMessage();
        }
        time2 = System.currentTimeMillis();
        return (time2 - time1);
    }

    /**
     * Import scrabble key and value in treemap
     */
    public long importScrabbleT() {
        long time1, time2;
        time1 = System.currentTimeMillis();
        try(Scanner in = new Scanner(new File("src/scrabbleValues"))) {
            // Scan through every line
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineSc = new Scanner(line);
                //Scan through each value in the line
                while (lineSc.hasNext()) {
                    String key = lineSc.next();
                    int value = lineSc.nextInt();
                    tmap2.put(key, value);
                }
            }
        }
        catch (FileNotFoundException e) {
            e.getMessage();
        }
        time2 = System.currentTimeMillis();
        return (time2 - time1);
    }

    /**
     * Import scrabble key and value in hashmap
     */
    public long importScrabbleH() {
        long time1, time2;
        time1 = System.currentTimeMillis();
        try(Scanner in = new Scanner(new File("src/scrabbleValues"))) {
            // Scan through every line
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineSc = new Scanner(line);
                //Scan through each value in the line
                while (lineSc.hasNext()) {
                    String key = lineSc.next();
                    int value = lineSc.nextInt();
                    hmap2.put(key, value);
                }
            }
        }
        catch (FileNotFoundException e) {
            e.getMessage();
        }
        time2 = System.currentTimeMillis();
        return (time2 - time1);
    }


    /**
     * Generate Values for Q not U file
     */
    public void generateValues() {
        int result = 0;
        for (Map.Entry<String, Integer> entry : tmap1.entrySet()) {
            String word = entry.getKey();
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                String l = Character.toString(letter);
                for (Map.Entry<String, Integer> entry1 : tmap2.entrySet()) {
                    String key = entry1.getKey();
                    if (l.equals(key))
                        result += entry1.getValue();
                }
            }
            values.add(result);
            result = 0;
        }
    }


    /**
     * Getter for values
     * @return list of values
     */
    public List<Integer> getValues() {
        return values;
    }


}