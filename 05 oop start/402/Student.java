
public class Student {
    private String fio;
    private int year;
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int m) {
        money = m;
    }

    //Name of constructor is the name of the class
    public Student(String s, int y) {
        fio = s;
        year = y;
    }

    public String getFio() {
        return fio;
    }

    public int getYear() {
        return year;
    }

    public void setFio(String s) {
        fio = s;
    }

    public void setYear(int t) {
        year = t;
    }

    public void saysHiTo(Student stud) {
        System.out.println("Я, студент " + fio +
        ", привествую студента с именем " + stud.getFio());
    }


    public void donate(Student student2, int i) {
        student2.setMoney(student2.getMoney() + i);
        money -= i;
    }
}
