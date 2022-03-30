package com.company;
public class Main {
    public static void main(String[] args) {

        Cow[] cows = {new Cow(78, 2, "Female", "Black"),
                new Cow(97, 3, "Female", "Red"),
                new Cow(76, 1, "Female", "Black"),
                new Cow(60, 3, "Female", "Green"),
                new Cow(95, 1, "Female", "Brown")};


        Cow [] cows2 = {new Cow(80, 3, "Female", "Pink")};


        Horse [] horses = {new Horse(100, 2, "Female", "Fast"),
                new Horse(110, 3, "Male", "Tayson")};

        Horse [] horses2 = {new Horse(100, 2, "Male", "Mustang")};

        Sheep [] sheep = {new Sheep(30, 2, "Female", "Yetty"),
                new Sheep(28, 1, "Female", "Tetty"),
                new Sheep(34, 2, "Female", "Neddy")};

        Sheep [] sheep2 = {new Sheep(40, 3, "Male", "Puppy")};

        Farm farm1 = new Farm("Kyrgyzstan, Batken dist., Alga reg., Jayloo-1 vill.",
                cows, horses, sheep, "Azat malchy");
        Farm farm2 = new Farm("Kyrgyzstan, Naryn dist., Uluu - too reg., Jayloo-2 vill.",
                cows2, horses2, sheep2, "Azamat koychu");

        System.out.println(farm1);
        System.out.println("\n" + farm2);

    }
}