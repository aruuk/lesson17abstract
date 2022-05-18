package com.company;

public abstract class Animals {
    private String name;
    private int age;
    private int weight;
    private String gender;

//    public abstract String method(String name, int age, int weight, String gender);

    public Animals() {
    }

    public Animals(String name, int age, int weight, String gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "name: " + name +", "+
                "age: " + age + ", "+
                "weight: " + weight +", "+
                "gender: " + gender +"; ";
    }
}
