import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by ma on 17.03.15.
 */
public class Script {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("11401.txt"));
        scanner.nextLine();
        scanner.nextLine();
        HashSet<Student> students = new HashSet<Student>();
        ArrayList<String> numTasks = new ArrayList<String>();
        int currentTasksNum = 0;
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().trim();
            String [] arrayData = s.split("\t");
            if (isInfo(arrayData[0])) {
                int delta = currentTasksNum - (arrayData.length - 1);
                if (delta != 0) {
                    System.out.println(delta);
                }
                // we have student here
                Student st = getStudentByLastName(students, arrayData[0].trim());
                if (st != null) {
                    int x = currentTasksNum;
                    st.addData(arrayData);
                }
                else {
                    // student does not exists. Creating Student
                    st = new Student(arrayData);
                    students.add(st);
                }
                st.addBlankTasks(delta);
            }
            else {
                for (String number: arrayData)
                    numTasks.add(number.trim());
                currentTasksNum = arrayData.length;
                System.out.println(currentTasksNum);
            }
        }
        for (Student student: students) {
            System.out.println(student);
        }
    }

    private static Student getStudentByLastName(HashSet<Student> students, String lastName) {
        Iterator<Student> i = students.iterator();
        while (i.hasNext()) {
            Student tmp = i.next();
            if (tmp.getName().equals(lastName))
                return tmp;
        }
        return null;
    }

    private static boolean isInfo(String s) {
        return (s.charAt(0) <= 'Я' && s.charAt(0) >= 'А');
    }
}
