
public class TestClass {
    public static void main(String[] args) {
        Student.studentInfo();
        Student s = new Student("Нургалиев Д.Р.", 1995);
        Student s2 = new Student("Козловский П.А.", 1996);

        //System.out.println(s2.getFio());
        s.greet(s2);
        s2.greet(s);
s
        s.studentInfo();
        s2.studentInfo();
    }
}
