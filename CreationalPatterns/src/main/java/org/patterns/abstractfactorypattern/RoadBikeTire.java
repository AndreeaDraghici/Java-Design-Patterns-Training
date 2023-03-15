
package org.patterns.abstractfactorypattern;

/**
 * Created by Andreea Draghici on 15.03.2023
 * Name of project: CreationalPatterns
 */
public class RoadBikeTire extends Tire {
    
    private static final String width = "NARROW";
    private static final String pressure = "HIGH";
    
    @Override
    public void getDescription() {
        System.out.println("Road bike tire width: " + width + ", pressure: " + pressure);        
    }
    
}
