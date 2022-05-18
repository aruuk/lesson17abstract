package com.company;

public class Sheep extends Animals{
//    public Sheep(String name, int age, int weight, String gender) {}
//
//    public Sheep() {}
//
//    @Override
//    public String method(String name, int age, int weight, String gender) {
//        return "name: "+name + ", age: "+ age + " weight: "+ weight + "gender: "+ gender;
//    }

    public Sheep() {
    }

    public Sheep(String name, int age, int weight, String gender) {
        super(name, age, weight, gender);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
