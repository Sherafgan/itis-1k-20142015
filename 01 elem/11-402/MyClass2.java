package classwork.lek02;

import classwork.Elem;

public class MyClass2 {
    public static void main(String[] args) {
        Elem head = null;
        Elem p;

        int n = 5;
        for (int i = 0; i < n; i++) {
            p = new Elem();
            p.setValue(i);
            p.setNext(head);
            head = p;
        }

        //i = 0;
        p = head;

        int sum = 0;
        //while (i < n)
        while (p != null) {
            System.out.println(p.getValue());
            sum += p.getValue();
            
            //i += 1
            p = p.getNext();
        }
        System.out.println(sum);

    }
}
