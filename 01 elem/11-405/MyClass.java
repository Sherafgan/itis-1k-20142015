package classwork.lek02;

import classwork.Elem;

public class MyClass {
    public static void main(String[] args) {
        Elem head = null;
        Elem p;

        /*
        p = new Elem();
        p.setValue(2);
        p.setNext(head);
        */
        p = new Elem(2, head);
        head = p;

        /*
        p = new Elem();
        p.setValue(5);
        p.setNext(head);
        */
        p = new Elem(5, head);
        head = p;

        //i = 0
        p = head;
        int sum = 0;
        //while (i < n)
        while (p != null) {
            //System.out.println(a[i]);
            System.out.println(p.getValue());
            sum += p.getValue();
            // i = i + 1
            p = p.getNext();
        }
        System.out.println(sum);

    }
}
