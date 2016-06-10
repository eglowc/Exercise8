package com.inaction.ex;

/**
 * Created by hclee on 2016-06-10.
 *
 * @author hclee
 */
public class Fruit {

    private String color;
    private int weight;

    public Fruit(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Fruit(int weight) {
        this.weight = weight;
    }

    public Fruit() {
        super();
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
