import java.util.Scanner;

/**
 * Created by ma on 31.10.14.
 */
public class SimpleStupid {

    public static int fact(int n) {
        int p = 1;
        for (int i = 1; i < n; i ++)
            p = p * i;
        return p;
    }

    public static int pow(int x, int n) {
        int p = 1;
        for (int i = 1; i < n; i++) {
            p = p * x;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = fact(n) + pow(3, n);
        System.out.println(r);
    }
}
