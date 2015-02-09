public class TestClass {

    public static void main(String[] args) {

        Student student = new Student("Каримова А.И.", 1996, 250);
        Student student2 = new Student("Татарских Р.А.", 1996, 100);

        student.saysHiTo(student2);
        student2.saysHiTo(student);

        student.donateMoney(student2, 100);
    }

}
