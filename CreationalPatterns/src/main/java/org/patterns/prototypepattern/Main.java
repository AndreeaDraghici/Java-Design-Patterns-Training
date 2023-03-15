package org.patterns.prototypepattern;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setOwner("Sally");
        Rabbit rabbitCopy = rabbit.clone();
        System.out.println("Name of first owner " + rabbit.getOwner().getName());
        System.out.println("Name of first owner " + rabbitCopy.getOwner().getName());

    }
}
