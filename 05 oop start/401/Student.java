public class Student {

    private String fio;
    private int year;
    private int money;

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Student(String fio, int year, int money) {
        this.fio = fio;
        this.year = year;
        this.money = money;
    }

    public String getFio() {
        return this.fio;
    }

    public int getYear() {
        return this.year;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void saysHiTo(Student stud) {
        System.out.println("Я, " + this.fio +
        ", приветсвую студента с именем " + stud.getFio());
    }

    public void donateMoney(Student student2, int i) {
        if (money >= i) {
            student2.setMoney(student2.getMoney() + i);
            this.money -= i;
        }
        else {
            System.out.println("Sorry, no money");
        }
    }
}
