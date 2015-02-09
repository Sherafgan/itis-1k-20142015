import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ma on 28.11.14.
 */
public class TestClass {
    public static void main(String[] args) {

        //Исключение возможно, но его не требуют обработать
        try {
            int c = 2 / 0;
        } catch (ArithmeticException e ) {
        }

        //FileNotFoundException - требуют обработать
        try {
            Scanner scanner = new Scanner(new File(""));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Я реально продолжаю работать, честно!");

    }
}
