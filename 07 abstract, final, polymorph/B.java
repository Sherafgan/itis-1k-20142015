import java.util.Scanner;

class A {
    public final void f() {
        System.out.println("f from A");
    }
}
public final class B extends A {
    //@Override
    //public void f() {} - нельзя, т.к. у родителя метод final
}

// class C extends B {} Нельзя, т.к. B - final