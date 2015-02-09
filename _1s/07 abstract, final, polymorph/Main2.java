
abstract class Animal {
    public abstract void voice();
}

class Cat extends Animal {
    public void voice() {
        System.out.println("miau!");
    }
}

class Dog extends Animal {
    public void voice() {
        System.out.println("ghawk!");
    }
}


public class Main2 {
    public static void main(String[] args) {
        final int n = 10;
        Animal [] animals = new Animal[n];
        for (int i = 0; i<n; i+=2) {
            animals[i] = new Dog();
            animals[i+1] = new Cat();
        }
        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
