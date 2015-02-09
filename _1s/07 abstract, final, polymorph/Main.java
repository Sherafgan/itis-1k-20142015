
class Car {
    private int id;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Car() {
        id = count++;
        System.out.println("Car #" + id + ". Number of cars: " + count);
    }
}
public class Main {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(Car.getCount());
    }
}
