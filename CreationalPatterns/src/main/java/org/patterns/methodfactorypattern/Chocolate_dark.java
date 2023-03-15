
package org.patterns.methodfactorypattern;

import java.util.ArrayList;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class Chocolate_dark extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            Chocolate_dark chocolate = new Chocolate_dark();
            chocolatePackage.add(chocolate);
        }

        System.out.println("One package of " + quantity + " dark chocolates has been made!");
        return chocolatePackage;

    }

}
