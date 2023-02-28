package org.example;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        System.out.println(animalFactory.create("dog").makeNoise());

        System.out.println("Hello world!");
    }
}