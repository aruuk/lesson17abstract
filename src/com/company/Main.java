package com.company;

public class Main {

    public static void main(String[] args) {

        Cow cow1 = new Cow("lili",12,612,"female");
        Cow cow2 = new Cow("jake",11,720,"male");
        Cow cow3 = new Cow("lola", 10, 630, "female");
        Cow cow4 = new Cow("joke", 9,740,"male");
        Cow cow5= new Cow("soda", 11, 653, "female");

        Sheep sheep1 = new Sheep("sidr", 11, 12,"female");
        Sheep sheep2 = new Sheep("fushka", 11, 12,"female");
        Sheep sheep3 = new Sheep("green", 11, 12,"female");

        Horse horse1 = new Horse("Maya", 20, 567,"female","grey");
        Horse horse2 = new Horse("Kefir",14,456,"female", "white");

        Farm farm1 = new Farm();
        farm1.setAddress("Kievskaya");
        farm1.setOwnerName("Jakyp");
        farm1.setCows(new Cow[]{cow1, cow2, cow3, cow4, cow5});
        farm1.setSheep(new Sheep[]{sheep1, sheep2, sheep3});
        farm1.setHorses(new Horse[]{horse1,horse2});
        System.out.println(farm1);


        Farm farm2 = new Farm();
        farm2.setAddress("Maldybeva");
        farm2.setOwnerName("Postuh");
        farm2.setCows(new Cow[]{cow1});
        farm2.setSheep(new Sheep[]{sheep1});
        farm2.setHorses(new Horse[]{horse1});
        System.out.println(farm2);
    }
}
