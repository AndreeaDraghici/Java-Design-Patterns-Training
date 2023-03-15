package org.patterns.methodfactorypattern;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class CandyStore {
    
    private static final CandyFactory chocolateFactory = new ChocolateFactory();
    private static final CandyFactory hardCandyFactory = new HardCandyFactory();

    public static void main(String[] args) {              
        chocolateFactory.getCandyPackage(7, "dark");   
        hardCandyFactory.getCandyPackage(14, "lollipop");
        hardCandyFactory.getCandyPackage(50, "candy cane");        
    }


}
