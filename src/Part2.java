import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Part2 {
    HashSet<String> hashSet;
    TreeSet<String> treeSet;

    /**
     * Null Constructor
     */
    public Part2() {
        hashSet = new HashSet<String>();
        treeSet = new TreeSet<String>();
    }

    /**
     * Method to import text file into hashset
     * @param path String value for path of file
     * @return time to import into hashset
     */
    public long importHashSet(String path) {
        long time1, time2;
        time1 = System.currentTimeMillis();
        try (Scanner in = new Scanner(new File(path))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineSC = new Scanner(line);
                while(lineSC.hasNext()) {
                    String word = lineSC.next();
                    hashSet.add(word);
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        time2 = System.currentTimeMillis();
        return (time2-time1);
    }

    /**
     * Search text 100 times for given word
     * @param word word to be searched for
     * @return time taken to search for word 100 times
     */
    public long searchHash(String word) {
        long time1, time2;
        time1 = System.currentTimeMillis();
        Iterator<String> iterator = hashSet.iterator();
        for (int i = 0; i < 100; i++) {
            while (iterator.hasNext()) {
                String foundWord = iterator.next();
                if (foundWord.equals(word))
                    break;
            }
        }
        time2 = System.currentTimeMillis();
        return (time2-time1);
    }

    /**
     * Method to import text file into treeset
     * @param path String value for path of file
     * @return time to import into treeset
     */
    public long importTreeSet(String path) {
        long time1, time2;
        time1 = System.currentTimeMillis();
        try (Scanner in = new Scanner(new File(path))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineSC = new Scanner(line);
                while(lineSC.hasNext()) {
                    String word = lineSC.next();
                    treeSet.add(word);
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        time2 = System.currentTimeMillis();
        return (time2-time1);
    }

    /**
     * Search text 100 times for given word
     * @param word word to be searched for
     * @return time taken to search for word 100 times
     */
    public long searchTree(String word) {
        long time1, time2;
        time1 = System.currentTimeMillis();
        Iterator<String> iterator = treeSet.iterator();
        for (int i = 0; i < 100; i++) {
            while (iterator.hasNext()) {
                String foundWord = iterator.next();
                if (foundWord.equals(word))
                    break;
            }
        }
        time2 = System.currentTimeMillis();
        return (time2-time1);
    }
}
