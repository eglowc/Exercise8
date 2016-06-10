package com.inaction.ex;

/**
 * Created by hclee on 2016-06-10.
 *
 * @author hclee
 */
public class Apple extends Fruit{

    private String name;

    public Apple() {
    }

    public Apple(int weight) {
        super(weight);
    }

    public Apple(String color, int weight) {
        super(color, weight);
    }

    public Apple(String color, int weight, String name) {
        super(color, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
