import java.awt.*;
import java.util.Scanner;

/**
 * Created by ma on 24.10.14.
 */
public class ClassWork {
    public static void main(String[] args) {
        String s = "abcdf";
        System.out.println(s.length()); // 3
        System.out.println(s.startsWith("ab")); //true
        System.out.println(s.endsWith("df")); // true

        System.out.println(s.charAt(1)); // b

        String s2 = "abc" + s;

        System.out.println(s.indexOf('c')); // 2
        System.out.println(s.indexOf('q')); // -1

        System.out.println(s.lastIndexOf('d')); // 3

        System.out.println(s.toUpperCase()); //ABCDF
        System.out.println(s.toLowerCase()); //abcdf

        System.out.println(s.isEmpty()); // false

        String s100 = "Мама мыла раму";
        String [] a = s100.split(" ");
        for (String x : a) {
            System.out.println(x);
        }

        System.out.println(s.contains("abc")); //true
        System.out.println(s.equals(s2));

        System.out.println(s.substring(1,3)); // [1, 3)
    }
}
