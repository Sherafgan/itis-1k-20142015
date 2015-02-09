/**
 * Created by ma on 31.10.14.
 */
public class SimpleVeryStupid {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int i, int i1, int i2, int i3) {
        return i + i1 + i2 + i3;
    }

    public static boolean hasZero(int[] a) {
        for (int x : a) {
            if (x == 0)
                return true;
        }
        return false;
    }

    public static void f(int a) {
        a = a + 1;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 6));
        System.out.println(add(5, 6, 7));
        System.out.println(add(4, 5, 6, 7));
        System.out.println(hasZero(new int[]{1,2,3,4,5}));
        System.out.println(hasZero(new int[]{1,2,0,4,5}));
        int a = 5;
        f(a);
        System.out.println(a);
    }


}
