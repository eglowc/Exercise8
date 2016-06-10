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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Apple{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight='").append(getWeight()).append('\'');
        sb.append(", color='").append(getColor()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
