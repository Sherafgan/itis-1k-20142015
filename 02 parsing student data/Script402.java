import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by ma on 20.03.15.
 */
public class Script402 {
    public static void main(String[] args) throws FileNotFoundException {
        // reading data
        Scanner scanner = new Scanner(new File("11402.txt"));
        scanner.nextLine();
        scanner.nextLine();
        ArrayList<String> tasksNumbers = new ArrayList<String>();

        Map<String, ArrayList<String>> results =
                new HashMap<String, ArrayList<String>>();

        int currentNumberOfTasks = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            String [] lineData = line.split("\t");
            if (isAboutStudent(lineData[0])) {
                // хорошо: lineData.length = 1 + currentNumberOfTasks
                int delta = currentNumberOfTasks - (lineData.length - 1);
                if (results.containsKey(lineData[0])) {
                    List<String> hisResults = results.get(lineData[0]);
                    for (int i = 1; i < lineData.length; i++)
                        hisResults.add(lineData[i]);
                }
                else {
                    ArrayList<String> hisResults = new ArrayList<String>();
                    for (int i = 1; i < lineData.length; i++)
                        hisResults.add(lineData[i]);
                    results.put(lineData[0], hisResults);
                }
            }
            else {
                currentNumberOfTasks = lineData.length;
                for (String taskNum: lineData)
                    tasksNumbers.add(taskNum);
            }
        }
        System.out.println(tasksNumbers);
        System.out.println(results);
        // processing data

    }
    public static boolean isAboutStudent(String line) {
        return (line.charAt(0) >= 'А' && line.charAt(0) <= 'Я');
    }
}
