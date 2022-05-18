package com.company;

import java.util.Arrays;

public class Farm{
    private String address;
    private String ownerName;

    private Cow[] cows;
    private Sheep[] sheep;
    private Horse[] horses;

    public Farm() {
    }

    public Farm(String address, String ownerName, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "address: " + address + ",\n" +
                " ownerName: " + ownerName + ",\n" +
                " cows: " + Arrays.toString(cows) +",\n"+
                " sheep: " + Arrays.toString(sheep) +",\n"+
                " horses: " + Arrays.toString(horses);
    }
}
