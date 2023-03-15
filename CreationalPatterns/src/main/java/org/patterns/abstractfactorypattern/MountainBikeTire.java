package org.patterns.abstractfactorypattern;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class MountainBikeTire extends Tire {

    private static final String width = "WIDE";

    private static final String pressure = "MEDIUM";
    
    @Override
    public void getDescription() {
        System.out.println("Mountain bike tire. Width: " + width + ", pressure: " + pressure);        
    }

}
