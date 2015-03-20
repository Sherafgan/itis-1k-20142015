import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ma on 17.03.15.
 */
public class Student {
    private String name;
    private ArrayList<String> results = new ArrayList<String>();

    public Student(String[] s) {
        this.name = s[0].trim();
        for (int i = 1; i < s.length; i++) {
            this.results.add(s[i]);
        }
    }

    public void addData(String[] arrayData) {
        for (int i = 1; i < arrayData.length; i++) {
            this.results.add(arrayData[i]);
        }
    }

    public String toString() {
        return name+ ":" + results + results.size();
    }

    public String getName() {
        return name;
    }

    public void addBlankTasks(int delta) {
        for (int i = 0; i< delta; i++) {
            results.add(" ");
        }
    }
}
