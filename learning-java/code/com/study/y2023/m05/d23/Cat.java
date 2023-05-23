package com.learning.encapsulation;

public class Cat {
    String name;
    String color;

    public Cat() {
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Cat{name = " + name + ", color = " + color + "}";
    }
}
