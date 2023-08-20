package hfdp.chp1_strategy;

public class RubberDuck extends Duck {

    public RubberDuck(String name) {
        super(name);
    }

    @Override
    public void quack() {
        System.out.println("The rubber duck named " + name + " quacks quite differently!");
    }

    @Override
    public void display() {
        System.out.println("See " + name + " the rubber duck swim in the pond.");
    }
}
