import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by ma on 20.03.15.
 */
public class Script405 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, ArrayList<String>> results =
                new HashMap<String, ArrayList<String>>();
        Scanner scanner = new Scanner(new File("11405.txt"));
        ArrayList<String> tasksNumbers =
                new ArrayList<String>();
        scanner.nextLine();
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            String [] lineData = line.split("\t");
            if (isInfoAboutStudent(line)) {
                if (results.containsKey(lineData[0])) {
                    ArrayList<String> hisResults =
                            results.get(lineData[0]);
                    for (int i = 1; i<lineData.length; i++) {
                        hisResults.add(lineData[i]);
                    }
                }
                else {
                    //нет
                    ArrayList<String> hisResults =
                            new ArrayList<String>();
                    for (int i = 1; i<lineData.length; i++) {
                        hisResults.add(lineData[i]);
                    }
                    results.put(lineData[0], hisResults);
                }
            }
            else {
                for (String number: lineData)
                    tasksNumbers.add(number);
            }
        }
        System.out.println(tasksNumbers);
        System.out.println(results);
    }

    private static boolean isInfoAboutStudent(String line) {
        return (line.charAt(0) >= 'А' && line.charAt(0) <= 'Я');
    }
}
