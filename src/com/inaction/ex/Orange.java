package com.inaction.ex;

/**
 * Created by hclee on 2016-06-10.
 *
 * @author hclee
 */
public class Orange extends Fruit{

    private String name;

    public Orange(String color, int weight) {
        super(color, weight);
    }

    public Orange(int weight) {
        super(weight);
    }

    public Orange() {
    }

    public Orange(String color, int weight, String name) {
        super(color, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
