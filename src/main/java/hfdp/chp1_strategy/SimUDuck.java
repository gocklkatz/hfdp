package hfdp.chp1_strategy;

import java.util.ArrayList;
import java.util.List;

public class SimUDuck {

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();

        Duck d1 = new MallardDuck("Malli");
        Duck d2 = new RedheadDuck("Reddy");
        Duck d3 = new RubberDuck("Rubby");

        ducks.add(d1);
        ducks.add(d2);
        ducks.add(d3);

        for(Duck d : ducks) {
            d.quack();
            d.swim();
            d.display();
            d.fly();
            System.out.println("---");
        }
    }
}
