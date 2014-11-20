class Human {
    protected String name;
    public Human(String name) {
        this.name = name;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void printInfo() {
        System.out.println("Это человек с именем " + name);
    }}
class Student extends Human{
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {return groupName; }
    public void printInfo() {
        super.printInfo();
        System.out.println("Это студент с именем " + name);
    }}
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Диана", "11-405");
        System.out.println(student.getName());
        student.printInfo();
    }
}
