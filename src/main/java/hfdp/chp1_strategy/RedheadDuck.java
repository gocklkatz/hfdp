package hfdp.chp1_strategy;

public class RedheadDuck extends Duck {

    public RedheadDuck(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("See " + name + " the redhead duck swim in the pond.");
    }
}
