/**
 * Created by DNS on 10.04.2015.
 */
public class Task1 {
    public static void backTracking(String s, int n) {
        if (s.length() == n) {
            System.out.println(s);
        }
        else {
            int k = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    k++;
                }
            }
            if (k < 2) {
                backTracking(s.concat("0"), n);
                backTracking(s.concat("1"), n);
            }
            else {
                backTracking(s.concat("0"), n);
            }
        }
    }

    public static void main(String[] args) {
        backTracking("", 7);
    }
}
