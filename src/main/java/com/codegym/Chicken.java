package com.codegym;

public class Chicken extends Animal implements Edible {
    @Override
    public String howtoEat() {
        return "could be fried.";
    }

    @Override
    public String makeSound() {
        return "ò ó o o";
    }
}
