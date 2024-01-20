package com.company;

import com.company.A.Rectangle;
import com.company.A.Trapezium;
import com.company.A.Triangle;
import com.company.B.Cat;
import com.company.B.Dog;
import com.company.B.Duck;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Trapezium trapezium = new Trapezium(2, 6, 4);
        Rectangle rectangle = new Rectangle(5, 8);

        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

        System.out.println("Trapezium Area: " + trapezium.calculateArea());
        System.out.println("Trapezium Perimeter: " + trapezium.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("_ _ _ _ _ ");

        Dog dog = new Dog("Pluto", "Bow Wow");
        Duck duck = new Duck("Scrooge mcDuck", "Quack Quack");
        Cat cat = new Cat("Garfield", "Meow Meow");


        System.out.println("Dog:");
        System.out.println("Name: " + dog.getName());
        System.out.print("Sound: ");
        dog.sound();
        System.out.println();


        System.out.println("Duck:");
        System.out.println("Name: " + duck.getName());
        System.out.print("Sound: ");
        duck.sound();
        System.out.println();


        System.out.println("Cat:");
        System.out.println("Name: " + cat.getName());
        System.out.print("Sound: ");
        cat.sound();

    }
}