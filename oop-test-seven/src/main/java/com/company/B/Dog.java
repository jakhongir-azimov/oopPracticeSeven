package com.company.B;

public class Dog extends Animal {
    private String bow;

    public Dog(String name, String bow) {
        super(name);
        this.bow = bow;
    }

    @Override
    public void sound() {
        System.out.println(bow);
    }

    @Override
    public String getName() {
        return name;
    }
}
