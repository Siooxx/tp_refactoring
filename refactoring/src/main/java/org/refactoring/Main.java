package org.refactoring;

import org.refactoring.animal.Cat;
import org.refactoring.animal.Dog;
import org.refactoring.shape.Logger;
import org.refactoring.shape.Shape;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
        dog.fetchBall();
        cat.chaseMouse();


        Shape shape = new Shape();
        new Logger().LogDrawing(shape);
    }
}