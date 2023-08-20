package hfdp.chp1_strategy;

public class MallardDuck extends Duck {

    public MallardDuck(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("See " + name + " the mallard duck swim in the pond.");
    }
}
