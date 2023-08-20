package hfdp.chp1_strategy;

public abstract class Duck {

    protected final String name;

    public Duck(String name) {
        this.name = name;
    }

    public void quack() {
        System.out.println("The duck named " + name + " quacks!");
    }

    public void swim() {
        System.out.println("The duck named " + name + " swims!");
    }

    public void fly() {
        System.out.println("The duck named " + name + " flies! (" + getClass().getSimpleName() + ")");
    }

    public abstract void display();

    // OTHER duck-like methods ...
}
