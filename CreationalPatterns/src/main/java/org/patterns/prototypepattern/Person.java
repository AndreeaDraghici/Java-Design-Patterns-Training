package org.patterns.prototypepattern;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class Person {

    private String name;

    public Person(String name) {

        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
