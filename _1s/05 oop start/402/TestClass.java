
public class TestClass {
    public static void main(String[] args) {
        Student student = new Student("Гарифуллин Д.М.", 1996);
        Student student2 = new Student("Евдокименко Д.А.", 1996);

        student.saysHiTo(student2);
        student2.saysHiTo(student);

        student.donate(student2, 100);

        //System.out.println(student.getFio());

    }
}
