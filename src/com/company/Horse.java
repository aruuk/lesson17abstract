package com.company;

public class Horse extends Animals{
//    public Horse(String name, int age, int weight, String gender) {
//    }
//
//    public Horse() {}
//
//    @Override
//    public String method(String name, int age, int weight, String gender) {
//
//        return name;
//    }
    private  String color;

    public Horse(String color) {
        this.color = color;
    }

    public Horse(String name, int age, int weight, String gender, String color) {
        super(name, age, weight, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "color='" + color + super.toString();
    }
}
